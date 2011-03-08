IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'bank_system')
	DROP DATABASE [bank_system]
GO

CREATE DATABASE [bank_system]  ON (NAME = N'bank_system_Data', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL\data\bank_system_Data.MDF' , SIZE = 2, FILEGROWTH = 10%) LOG ON (NAME = N'bank_system_Log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL\data\bank_system_Log.LDF' , SIZE = 1, FILEGROWTH = 10%)
 COLLATE SQL_Latin1_General_CP1_CI_AS
GO

exec sp_dboption N'bank_system', N'autoclose', N'true'
GO

exec sp_dboption N'bank_system', N'bulkcopy', N'false'
GO

exec sp_dboption N'bank_system', N'trunc. log', N'true'
GO

exec sp_dboption N'bank_system', N'torn page detection', N'true'
GO

exec sp_dboption N'bank_system', N'read only', N'false'
GO

exec sp_dboption N'bank_system', N'dbo use', N'false'
GO

exec sp_dboption N'bank_system', N'single', N'false'
GO

exec sp_dboption N'bank_system', N'autoshrink', N'true'
GO

exec sp_dboption N'bank_system', N'ANSI null default', N'false'
GO

exec sp_dboption N'bank_system', N'recursive triggers', N'false'
GO

exec sp_dboption N'bank_system', N'ANSI nulls', N'false'
GO

exec sp_dboption N'bank_system', N'concat null yields null', N'false'
GO

exec sp_dboption N'bank_system', N'cursor close on commit', N'false'
GO

exec sp_dboption N'bank_system', N'default to local cursor', N'false'
GO

exec sp_dboption N'bank_system', N'quoted identifier', N'false'
GO

exec sp_dboption N'bank_system', N'ANSI warnings', N'false'
GO

exec sp_dboption N'bank_system', N'auto create statistics', N'true'
GO

exec sp_dboption N'bank_system', N'auto update statistics', N'true'
GO

use [bank_system]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[FK_UsersAccounts_Accounts]') and OBJECTPROPERTY(id, N'IsForeignKey') = 1)
ALTER TABLE [dbo].[CustomerAccount] DROP CONSTRAINT FK_UsersAccounts_Accounts
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[FK_TransactionLog_Account]') and OBJECTPROPERTY(id, N'IsForeignKey') = 1)
ALTER TABLE [dbo].[TransactionLog] DROP CONSTRAINT FK_TransactionLog_Account
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[FK_Cards_Users]') and OBJECTPROPERTY(id, N'IsForeignKey') = 1)
ALTER TABLE [dbo].[BankCard] DROP CONSTRAINT FK_Cards_Users
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[FK_UsersAccounts_Users]') and OBJECTPROPERTY(id, N'IsForeignKey') = 1)
ALTER TABLE [dbo].[CustomerAccount] DROP CONSTRAINT FK_UsersAccounts_Users
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[Account]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[Account]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[BankCard]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[BankCard]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[Customer]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[Customer]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CustomerAccount]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[CustomerAccount]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[TransactionLog]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[TransactionLog]
GO

if not exists (select * from master.dbo.syslogins where loginname = N'bank')
BEGIN
	declare @logindb nvarchar(132), @loginlang nvarchar(132) select @logindb = N'bank_system', @loginlang = N'us_english'
	if @logindb is null or not exists (select * from master.dbo.sysdatabases where name = @logindb)
		select @logindb = N'master'
	if @loginlang is null or (not exists (select * from master.dbo.syslanguages where name = @loginlang) and @loginlang <> N'us_english')
		select @loginlang = @@language
	exec sp_addlogin N'bank', null, @logindb, @loginlang
END
GO

if not exists (select * from dbo.sysusers where name = N'bank' and uid < 16382)
	EXEC sp_grantdbaccess N'bank', N'bank'
GO

exec sp_addrolemember N'db_owner', N'bank'
GO

CREATE TABLE [dbo].[Account] (
	[accountId] [int] IDENTITY (10201, 1) NOT NULL ,
	[type] [char] (10) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[dateCreated] [datetime] NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[BankCard] (
	[cardNumber] [varchar] (16) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[pin] [char] (10) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[customerId] [int] NOT NULL ,
	[expirationDate] [datetime] NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Customer] (
	[customerId] [int] IDENTITY (1, 1) NOT NULL ,
	[firstName] [varchar] (50) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[lastName] [varchar] (50) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[CustomerAccount] (
	[customerId] [int] NOT NULL ,
	[accountId] [int] NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[TransactionLog] (
	[transactionId] [int] IDENTITY (1, 1) NOT NULL ,
	[accountId] [int] NOT NULL ,
	[customerId] [int] NOT NULL ,
	[dateCreated] [datetime] NOT NULL ,
	[type] [char] (10) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL ,
	[amount] [float] NOT NULL ,
	[clearFlag] [int] NOT NULL 
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Account] ADD 
	CONSTRAINT [PK_Accounts] PRIMARY KEY  CLUSTERED 
	(
		[accountId]
	)  ON [PRIMARY] 
GO

ALTER TABLE [dbo].[BankCard] ADD 
	CONSTRAINT [PK_Cards] PRIMARY KEY  CLUSTERED 
	(
		[cardNumber]
	)  ON [PRIMARY] 
GO

ALTER TABLE [dbo].[Customer] ADD 
	CONSTRAINT [PK_Users] PRIMARY KEY  CLUSTERED 
	(
		[customerId]
	)  ON [PRIMARY] 
GO

ALTER TABLE [dbo].[CustomerAccount] ADD 
	CONSTRAINT [PK_UsersAccounts] PRIMARY KEY  CLUSTERED 
	(
		[customerId],
		[accountId]
	)  ON [PRIMARY] 
GO

ALTER TABLE [dbo].[TransactionLog] ADD 
	CONSTRAINT [PK_TransactionLog] PRIMARY KEY  CLUSTERED 
	(
		[transactionId]
	)  ON [PRIMARY] 
GO

ALTER TABLE [dbo].[BankCard] ADD 
	CONSTRAINT [FK_Cards_Users] FOREIGN KEY 
	(
		[customerId]
	) REFERENCES [dbo].[Customer] (
		[customerId]
	)
GO

ALTER TABLE [dbo].[CustomerAccount] ADD 
	CONSTRAINT [FK_UsersAccounts_Accounts] FOREIGN KEY 
	(
		[accountId]
	) REFERENCES [dbo].[Account] (
		[accountId]
	),
	CONSTRAINT [FK_UsersAccounts_Users] FOREIGN KEY 
	(
		[customerId]
	) REFERENCES [dbo].[Customer] (
		[customerId]
	)
GO

ALTER TABLE [dbo].[TransactionLog] ADD 
	CONSTRAINT [FK_TransactionLog_Account] FOREIGN KEY 
	(
		[accountId]
	) REFERENCES [dbo].[Account] (
		[accountId]
	)
GO

