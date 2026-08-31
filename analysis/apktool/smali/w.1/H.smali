.class public final Lw/H;
.super Lw/C;
.source "SourceFile"


# instance fields
.field public O:LB0/o;

.field public P:Lw/d0;

.field public Q:Z

.field public R:LB5/f;

.field public S:LB5/f;


# virtual methods
.method public final E0(Lw/A;Lw/B;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lw/H;->O:LB0/o;

    .line 2
    .line 3
    new-instance v1, Lw/E;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, p0, v2}, Lw/E;-><init>(Lw/A;Lw/H;Lq5/c;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, LB0/o;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LN/r;

    .line 12
    .line 13
    new-instance v3, LN/p;

    .line 14
    .line 15
    invoke-direct {v3, v0, v1, v2}, LN/p;-><init>(LB0/o;Lw/E;Lq5/c;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lv/W;->r:Lv/W;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v3, p2}, LN/r;->b(Lv/W;LN/p;Ls5/c;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 25
    .line 26
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 27
    .line 28
    if-ne p1, v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p1, p2

    .line 32
    :goto_0
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    return-object p2
.end method

.method public final F0(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lw/H;->R:LB5/f;

    .line 6
    .line 7
    sget-object v1, Lw/D;->a:Le3/u;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lw/F;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, p1, p2, v2}, Lw/F;-><init>(Lw/H;JLq5/c;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    sget-object p2, LM5/x;->t:LM5/x;

    .line 28
    .line 29
    invoke-static {v0, v2, p2, v1, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final G0(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lw/H;->S:LB5/f;

    .line 6
    .line 7
    sget-object v1, Lw/D;->b:Le3/u;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lw/G;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, p1, p2, v2}, Lw/G;-><init>(Lw/H;JLq5/c;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    sget-object p2, LM5/x;->t:LM5/x;

    .line 28
    .line 29
    invoke-static {v0, v2, p2, v1, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final H0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw/H;->Q:Z

    .line 2
    .line 3
    return v0
.end method
