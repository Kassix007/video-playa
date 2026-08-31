.class public final LW2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/k;


# instance fields
.field public final a:LJ2/q;

.field public final b:LU2/n;


# direct methods
.method public constructor <init>(LJ2/q;LU2/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW2/d;->a:LJ2/q;

    .line 5
    .line 6
    iput-object p2, p0, LW2/d;->b:LU2/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LI2/d;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ls5/c;

    .line 9
    .line 10
    new-instance v1, LM5/Z;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v0, v2}, LM5/Z;-><init>(LB5/a;Lq5/c;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 17
    .line 18
    invoke-static {v0, v1, p1}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
