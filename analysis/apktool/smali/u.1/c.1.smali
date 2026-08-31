.class public final Lu/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ/m;

.field public final b:Ljava/lang/Object;

.field public final c:Lu/l;

.field public final d:LP/f0;

.field public final e:LP/f0;

.field public final f:Lu/O;

.field public final g:Lu/f0;

.field public final h:Lu/q;

.field public final i:Lu/q;

.field public final j:Lu/q;

.field public final k:Lu/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LZ/m;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lu/c;->a:LZ/m;

    .line 5
    .line 6
    iput-object p3, p0, Lu/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lu/l;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/16 v2, 0x3c

    .line 12
    .line 13
    invoke-direct {v0, p2, p1, v1, v2}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lu/c;->c:Lu/l;

    .line 17
    .line 18
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {p2}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lu/c;->d:LP/f0;

    .line 25
    .line 26
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lu/c;->e:LP/f0;

    .line 31
    .line 32
    new-instance p1, Lu/O;

    .line 33
    .line 34
    invoke-direct {p1}, Lu/O;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lu/c;->f:Lu/O;

    .line 38
    .line 39
    new-instance p1, Lu/f0;

    .line 40
    .line 41
    const p2, 0x44bb8000    # 1500.0f

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p2, p3}, Lu/f0;-><init>(FLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lu/c;->g:Lu/f0;

    .line 48
    .line 49
    iget-object p1, v0, Lu/l;->s:Lu/q;

    .line 50
    .line 51
    instance-of p2, p1, Lu/m;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    sget-object p3, Lu/d;->e:Lu/m;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    instance-of p3, p1, Lu/n;

    .line 59
    .line 60
    if-eqz p3, :cond_1

    .line 61
    .line 62
    sget-object p3, Lu/d;->f:Lu/n;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    instance-of p3, p1, Lu/o;

    .line 66
    .line 67
    if-eqz p3, :cond_2

    .line 68
    .line 69
    sget-object p3, Lu/d;->g:Lu/o;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object p3, Lu/d;->h:Lu/p;

    .line 73
    .line 74
    :goto_0
    iput-object p3, p0, Lu/c;->h:Lu/q;

    .line 75
    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    sget-object p1, Lu/d;->a:Lu/m;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    instance-of p2, p1, Lu/n;

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    sget-object p1, Lu/d;->b:Lu/n;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    instance-of p1, p1, Lu/o;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    sget-object p1, Lu/d;->c:Lu/o;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    sget-object p1, Lu/d;->d:Lu/p;

    .line 96
    .line 97
    :goto_1
    iput-object p1, p0, Lu/c;->i:Lu/q;

    .line 98
    .line 99
    iput-object p3, p0, Lu/c;->j:Lu/q;

    .line 100
    .line 101
    iput-object p1, p0, Lu/c;->k:Lu/q;

    .line 102
    .line 103
    return-void
.end method

.method public static final a(Lu/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lu/c;->a:LZ/m;

    .line 2
    .line 3
    iget-object v1, p0, Lu/c;->k:Lu/q;

    .line 4
    .line 5
    iget-object v2, p0, Lu/c;->j:Lu/q;

    .line 6
    .line 7
    iget-object v3, p0, Lu/c;->h:Lu/q;

    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lu/c;->i:Lu/q;

    .line 16
    .line 17
    invoke-static {v1, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object p0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, LB5/c;

    .line 27
    .line 28
    invoke-interface {p0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lu/q;

    .line 33
    .line 34
    invoke-virtual {p0}, Lu/q;->b()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    if-ge v4, v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Lu/q;->a(I)F

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-virtual {v2, v4}, Lu/q;->a(I)F

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    cmpg-float v6, v6, v7

    .line 51
    .line 52
    if-ltz v6, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v4}, Lu/q;->a(I)F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v1, v4}, Lu/q;->a(I)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    cmpl-float v6, v6, v7

    .line 63
    .line 64
    if-lez v6, :cond_2

    .line 65
    .line 66
    :cond_1
    invoke-virtual {p0, v4}, Lu/q;->a(I)F

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v2, v4}, Lu/q;->a(I)F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v1, v4}, Lu/q;->a(I)F

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v5, v6, v7}, LD5/a;->p(FFF)F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {p0, v4, v5}, Lu/q;->e(IF)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    if-eqz v5, :cond_4

    .line 90
    .line 91
    iget-object p1, v0, LZ/m;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, LB5/c;

    .line 94
    .line 95
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_4
    :goto_1
    return-object p1
.end method

.method public static final b(Lu/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu/c;->c:Lu/l;

    .line 2
    .line 3
    iget-object v1, v0, Lu/l;->s:Lu/q;

    .line 4
    .line 5
    invoke-virtual {v1}, Lu/q;->d()V

    .line 6
    .line 7
    .line 8
    const-wide/high16 v1, -0x8000000000000000L

    .line 9
    .line 10
    iput-wide v1, v0, Lu/l;->t:J

    .line 11
    .line 12
    iget-object p0, p0, Lu/c;->d:LP/f0;

    .line 13
    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static c(Lu/c;Ljava/lang/Object;Lu/k;Ls5/i;I)Ljava/lang/Object;
    .locals 9

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lu/c;->g:Lu/f0;

    .line 6
    .line 7
    :cond_0
    move-object v1, p2

    .line 8
    iget-object p2, p0, Lu/c;->a:LZ/m;

    .line 9
    .line 10
    iget-object p2, p2, LZ/m;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, LB5/c;

    .line 13
    .line 14
    iget-object p4, p0, Lu/c;->c:Lu/l;

    .line 15
    .line 16
    iget-object p4, p4, Lu/l;->s:Lu/q;

    .line 17
    .line 18
    invoke-interface {p2, p4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p0}, Lu/c;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v2, p0, Lu/c;->a:LZ/m;

    .line 27
    .line 28
    new-instance v0, Lu/n0;

    .line 29
    .line 30
    iget-object p4, v2, LZ/m;->s:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p4, LB5/c;

    .line 33
    .line 34
    invoke-interface {p4, p2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    move-object v5, p4

    .line 39
    check-cast v5, Lu/q;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    invoke-direct/range {v0 .. v5}, Lu/n0;-><init>(Lu/k;LZ/m;Ljava/lang/Object;Ljava/lang/Object;Lu/q;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lu/c;->c:Lu/l;

    .line 46
    .line 47
    iget-wide v6, p1, Lu/l;->t:J

    .line 48
    .line 49
    iget-object p1, p0, Lu/c;->f:Lu/O;

    .line 50
    .line 51
    new-instance v2, Lu/a;

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    move-object v3, p0

    .line 55
    move-object v4, p2

    .line 56
    move-object v5, v0

    .line 57
    invoke-direct/range {v2 .. v8}, Lu/a;-><init>(Lu/c;Ljava/lang/Object;Lu/n0;JLq5/c;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v2, p3}, Lu/O;->a(Lu/O;LB5/c;Lq5/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/c;->c:Lu/l;

    .line 2
    .line 3
    iget-object v0, v0, Lu/l;->r:LP/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ls5/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lu/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lu/b;-><init>(Lu/c;Ljava/lang/Object;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lu/c;->f:Lu/O;

    .line 8
    .line 9
    invoke-static {p1, v0, p2}, Lu/O;->a(Lu/O;LB5/c;Lq5/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 14
    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p1
.end method
