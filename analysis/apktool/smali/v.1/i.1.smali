.class public final Lv/i;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lv/x;


# direct methods
.method public constructor <init>(Lv/x;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/i;->q:Lv/x;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, Lv/i;

    .line 2
    .line 3
    iget-object v0, p0, Lv/i;->q:Lv/x;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lv/i;-><init>(Lv/x;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lv/i;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv/i;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lv/i;->q:Lv/x;

    .line 5
    .line 6
    iget-object v0, p1, Lv/x;->P:Ly/f;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v1, Ly/g;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ly/g;-><init>(Ly/f;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lv/x;->G:Ly/i;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lc0/l;->l0()LM5/w;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Lv/b;

    .line 25
    .line 26
    invoke-direct {v4, v0, v1, v2}, Lv/b;-><init>(Ly/i;Ly/g;Lq5/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    invoke-static {v3, v2, v2, v4, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 31
    .line 32
    .line 33
    :cond_0
    iput-object v2, p1, Lv/x;->P:Ly/f;

    .line 34
    .line 35
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p1
.end method
