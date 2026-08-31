.class public final LA/g0;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;


# instance fields
.field public E:LA/x;

.field public F:Lkotlin/jvm/internal/n;


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 8

    .line 1
    iget-object v0, p0, LA/g0;->E:LA/x;

    .line 2
    .line 3
    sget-object v1, LA/x;->q:LA/x;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    iget-object v1, p0, LA/g0;->E:LA/x;

    .line 15
    .line 16
    sget-object v3, LA/x;->r:LA/x;

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :goto_1
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0, v1, v2, v3}, LW0/b;->a(IIII)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-interface {p2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget p2, v5, Lz0/J;->q:I

    .line 42
    .line 43
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p2, v0, v1}, LD5/a;->q(III)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget p2, v5, Lz0/J;->r:I

    .line 56
    .line 57
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    invoke-static {p2, v0, p3}, LD5/a;->q(III)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    new-instance v2, LA/f0;

    .line 70
    .line 71
    move-object v3, p0

    .line 72
    move-object v7, p1

    .line 73
    invoke-direct/range {v2 .. v7}, LA/f0;-><init>(LA/g0;ILz0/J;ILB0/T;)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Ln5/t;->q:Ln5/t;

    .line 77
    .line 78
    invoke-interface {v7, v4, v6, p1, v2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
.end method
