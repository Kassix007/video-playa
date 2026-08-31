.class public abstract Landroidx/compose/foundation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lc0/m;JLj0/E;)Lc0/m;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/BackgroundElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLj0/E;)V

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

.method public static final b(Lc0/m;Ly/i;Lv/P;ZLI0/f;LB5/a;)Lc0/m;
    .locals 8

    .line 1
    instance-of v0, p2, Lv/V;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v3, p2

    .line 6
    check-cast v3, Lv/V;

    .line 7
    .line 8
    new-instance v1, Landroidx/compose/foundation/ClickableElement;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    move v4, p3

    .line 12
    move-object v5, p4

    .line 13
    move-object v6, p5

    .line 14
    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/ClickableElement;-><init>(Ly/i;Lv/V;ZLI0/f;LB5/a;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, p1

    .line 19
    move v5, p3

    .line 20
    move-object v6, p4

    .line 21
    move-object v7, p5

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    new-instance v2, Landroidx/compose/foundation/ClickableElement;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Ly/i;Lv/V;ZLI0/f;LB5/a;)V

    .line 28
    .line 29
    .line 30
    move-object v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-static {v3, p2}, Landroidx/compose/foundation/c;->a(Ly/i;Lv/P;)Lc0/m;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v2, Landroidx/compose/foundation/ClickableElement;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Ly/i;Lv/V;ZLI0/f;LB5/a;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v2}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p1, Landroidx/compose/foundation/b;

    .line 50
    .line 51
    invoke-direct {p1, p2, v5, v6, v7}, Landroidx/compose/foundation/b;-><init>(Lv/P;ZLI0/f;LB5/a;)V

    .line 52
    .line 53
    .line 54
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 55
    .line 56
    invoke-static {p2, p1}, Lc0/o;->a(Lc0/m;LB5/f;)Lc0/m;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {p0, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static synthetic c(Lc0/m;Ly/i;Lv/P;ZLI0/f;LB5/a;I)Lc0/m;
    .locals 6

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    move v3, p3

    .line 7
    and-int/lit8 p3, p6, 0x10

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v4, p4

    .line 16
    move-object v5, p5

    .line 17
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/a;->b(Lc0/m;Ly/i;Lv/P;ZLI0/f;LB5/a;)Lc0/m;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static d(Lc0/m;LB5/a;)Lc0/m;
    .locals 2

    .line 1
    new-instance v0, LA/b0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p1}, LA/b0;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Lc0/o;->a(Lc0/m;LB5/f;)Lc0/m;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final e(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, LQ2/g;->d(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-wide v2, Lt0/a;->f:J

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lt0/a;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    move p0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v3, Lt0/a;->i:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4}, Lt0/a;->a(JJ)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    :goto_0
    if-eqz p0, :cond_1

    .line 27
    .line 28
    move p0, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget-wide v3, Lt0/a;->m:J

    .line 31
    .line 32
    invoke-static {v0, v1, v3, v4}, Lt0/a;->a(JJ)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_1
    if-eqz p0, :cond_2

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    sget-wide v2, Lt0/a;->h:J

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lt0/a;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public static final f(Lc0/m;Lw/A0;Lw/d0;ZLw/I;Ly/i;Lv/l;LF/o;)Lc0/m;
    .locals 8

    .line 1
    sget v0, Lv/z;->a:F

    .line 2
    .line 3
    sget-object v0, Lw/d0;->q:Lw/d0;

    .line 4
    .line 5
    sget-object v1, Lc0/j;->q:Lc0/j;

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lv/M;->t:Lv/M;

    .line 10
    .line 11
    invoke-static {v1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lv/M;->r:Lv/M;

    .line 17
    .line 18
    invoke-static {v1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v0, Landroidx/compose/foundation/ScrollingContainerElement;

    .line 27
    .line 28
    move-object v5, p1

    .line 29
    move-object v4, p2

    .line 30
    move v7, p3

    .line 31
    move-object v3, p4

    .line 32
    move-object v6, p5

    .line 33
    move-object v1, p6

    .line 34
    move-object v2, p7

    .line 35
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ScrollingContainerElement;-><init>(Lv/l;Lw/c;Lw/I;Lw/d0;Lw/A0;Ly/i;Z)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
