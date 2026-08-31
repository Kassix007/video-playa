.class public abstract Landroidx/room/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final version:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/room/x;->version:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract createAllTables(Lj2/a;)V
.end method

.method public abstract dropAllTables(Lj2/a;)V
.end method

.method public abstract onCreate(Lj2/a;)V
.end method

.method public abstract onOpen(Lj2/a;)V
.end method

.method public abstract onPostMigrate(Lj2/a;)V
.end method

.method public abstract onPreMigrate(Lj2/a;)V
.end method

.method public abstract onValidateSchema(Lj2/a;)Landroidx/room/y;
.end method

.method public validateMigration(Lj2/a;)V
    .locals 1
    .annotation runtime Lm5/c;
    .end annotation

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "validateMigration is deprecated"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method
