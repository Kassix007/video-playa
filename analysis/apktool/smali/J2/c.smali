.class public final LJ2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/j;


# instance fields
.field public final a:LU5/i;

.field public final b:LJ2/n;


# direct methods
.method public constructor <init>(LU5/i;LJ2/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ2/c;->a:LU5/i;

    .line 5
    .line 6
    iput-object p2, p0, LJ2/c;->b:LJ2/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LL2/i;LU2/n;)LJ2/k;
    .locals 3

    .line 1
    new-instance v0, LJ2/e;

    .line 2
    .line 3
    iget-object p1, p1, LL2/i;->a:LJ2/q;

    .line 4
    .line 5
    iget-object v1, p0, LJ2/c;->a:LU5/i;

    .line 6
    .line 7
    iget-object v2, p0, LJ2/c;->b:LJ2/n;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, v1, v2}, LJ2/e;-><init>(LJ2/q;LU2/n;LU5/i;LJ2/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
