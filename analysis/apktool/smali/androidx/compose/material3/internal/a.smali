.class public abstract Landroidx/compose/material3/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LB5/a;LB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LN/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN/c;

    .line 7
    .line 8
    iget v1, v0, LN/c;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN/c;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN/c;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN/c;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LN/c;->r:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch LN/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :try_start_1
    new-instance p2, LN/g;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {p2, p0, p1, v1}, LN/g;-><init>(LB5/a;LB5/e;Lq5/c;)V

    .line 53
    .line 54
    .line 55
    iput v2, v0, LN/c;->r:I

    .line 56
    .line 57
    invoke-static {p2, v0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_1
    .catch LN/a; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 62
    .line 63
    if-ne p0, p1, :cond_3

    .line 64
    .line 65
    return-object p1

    .line 66
    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 67
    .line 68
    return-object p0
.end method

.method public static final b(LN/r;Ljava/lang/Object;FLs5/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LN/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p2, v1}, LN/b;-><init>(LN/r;FLq5/c;)V

    .line 5
    .line 6
    .line 7
    sget-object p2, Lv/W;->q:Lv/W;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, v0, p3}, LN/r;->a(Ljava/lang/Object;Lv/W;LN/b;Ls5/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final c(Lc0/m;LN/r;LB5/e;)Lc0/m;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/material3/internal/DraggableAnchorsElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/material3/internal/DraggableAnchorsElement;-><init>(LN/r;LB5/e;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
