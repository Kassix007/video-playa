.class public final LU1/j;
.super LT1/q;
.source "SourceFile"


# instance fields
.field public final f:LU1/i;

.field public final g:LX/e;


# direct methods
.method public constructor <init>(LU1/i;Ljava/lang/String;LX/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LT1/q;-><init>(LT1/z;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU1/j;->f:LU1/i;

    .line 5
    .line 6
    iput-object p3, p0, LU1/j;->g:LX/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LT1/p;
    .locals 1

    .line 1
    invoke-super {p0}, LT1/q;->a()LT1/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LU1/h;

    .line 6
    .line 7
    return-object v0
.end method

.method public final b()LT1/p;
    .locals 3

    .line 1
    new-instance v0, LU1/h;

    .line 2
    .line 3
    iget-object v1, p0, LU1/j;->f:LU1/i;

    .line 4
    .line 5
    iget-object v2, p0, LU1/j;->g:LX/e;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LU1/h;-><init>(LU1/i;LX/e;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
