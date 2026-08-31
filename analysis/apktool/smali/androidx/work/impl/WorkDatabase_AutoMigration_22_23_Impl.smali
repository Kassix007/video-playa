.class final Landroidx/work/impl/WorkDatabase_AutoMigration_22_23_Impl;
.super Le2/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Le2/b;-><init>(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public migrate(Lj2/a;)V
    .locals 1

    .line 1
    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lj2/a;->l(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
