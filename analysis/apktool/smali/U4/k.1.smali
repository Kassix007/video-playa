.class public final LU4/k;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LP/W;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;


# direct methods
.method public constructor <init>(LP/W;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/k;->q:LP/W;

    .line 2
    .line 3
    iput-object p2, p0, LU4/k;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU4/k;->s:LP/W;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LU4/k;

    .line 2
    .line 3
    iget-object v0, p0, LU4/k;->r:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, LU4/k;->s:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, LU4/k;->q:LP/W;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU4/k;-><init>(LP/W;LP/W;LP/W;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/k;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/k;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/k;->q:LP/W;

    .line 5
    .line 6
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lg5/c;

    .line 11
    .line 12
    new-instance v0, LU4/i;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-object v2, p0, LU4/k;->r:LP/W;

    .line 16
    .line 17
    iget-object v3, p0, LU4/k;->s:LP/W;

    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, LU4/i;-><init>(LP/W;LP/W;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, Lg5/b;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0}, Lg5/b;-><init>(Lg5/c;LU4/i;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object p1
.end method
