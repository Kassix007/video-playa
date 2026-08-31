.class public final LU1/q;
.super LT1/p;
.source "SourceFile"

# interfaces
.implements LT1/c;


# instance fields
.field public final v:La1/i;

.field public final w:LX/e;


# direct methods
.method public constructor <init>(LU1/r;)V
    .locals 2

    .line 1
    sget-object v0, LU1/e;->a:LX/e;

    .line 2
    .line 3
    new-instance v1, La1/i;

    .line 4
    .line 5
    invoke-direct {v1}, La1/i;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, LT1/p;-><init>(LT1/z;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, LU1/q;->v:La1/i;

    .line 12
    .line 13
    iput-object v0, p0, LU1/q;->w:LX/e;

    .line 14
    .line 15
    return-void
.end method
