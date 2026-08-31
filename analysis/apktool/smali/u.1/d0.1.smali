.class public final Lu/d0;
.super LO3/D0;
.source "SourceFile"


# static fields
.field public static final I:Lu/m;

.field public static final J:Lu/m;


# instance fields
.field public final A:LU5/c;

.field public final B:Lu/O;

.field public C:J

.field public final D:Lr/C;

.field public E:Lu/S;

.field public final F:Lu/T;

.field public G:F

.field public final H:Lu/T;

.field public final s:LP/f0;

.field public final t:LP/f0;

.field public u:Ljava/lang/Object;

.field public v:Lu/v0;

.field public w:J

.field public final x:LA0/d;

.field public final y:LP/b0;

.field public z:LM5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu/m;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu/d0;->I:Lu/m;

    .line 8
    .line 9
    new-instance v0, Lu/m;

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lu/m;-><init>(F)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lu/d0;->J:Lu/m;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(LT1/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LO3/D0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lu/d0;->s:LP/f0;

    .line 9
    .line 10
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lu/d0;->t:LP/f0;

    .line 15
    .line 16
    iput-object p1, p0, Lu/d0;->u:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, LA0/d;

    .line 19
    .line 20
    const/16 v0, 0x1a

    .line 21
    .line 22
    invoke-direct {p1, v0, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lu/d0;->x:LA0/d;

    .line 26
    .line 27
    new-instance p1, LP/b0;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {p1, v0}, LP/b0;-><init>(F)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lu/d0;->y:LP/b0;

    .line 34
    .line 35
    new-instance p1, LU5/c;

    .line 36
    .line 37
    invoke-direct {p1}, LU5/c;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lu/d0;->A:LU5/c;

    .line 41
    .line 42
    new-instance p1, Lu/O;

    .line 43
    .line 44
    invoke-direct {p1}, Lu/O;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lu/d0;->B:Lu/O;

    .line 48
    .line 49
    const-wide/high16 v0, -0x8000000000000000L

    .line 50
    .line 51
    iput-wide v0, p0, Lu/d0;->C:J

    .line 52
    .line 53
    new-instance p1, Lr/C;

    .line 54
    .line 55
    invoke-direct {p1}, Lr/C;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lu/d0;->D:Lr/C;

    .line 59
    .line 60
    new-instance p1, Lu/T;

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-direct {p1, p0, v0}, Lu/T;-><init>(Lu/d0;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lu/d0;->F:Lu/T;

    .line 67
    .line 68
    new-instance p1, Lu/T;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-direct {p1, p0, v0}, Lu/T;-><init>(Lu/d0;I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lu/d0;->H:Lu/T;

    .line 75
    .line 76
    return-void
.end method

.method public static final p(Lu/d0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lu/d0;->v:Lu/v0;

    .line 2
    .line 3
    iget-object v1, p0, Lu/d0;->y:LP/b0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v2, p0, Lu/d0;->E:Lu/S;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v2, :cond_4

    .line 12
    .line 13
    iget-wide v4, p0, Lu/d0;->w:J

    .line 14
    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    cmp-long v2, v4, v6

    .line 18
    .line 19
    if-lez v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, LP/b0;->e()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Lu/d0;->t:LP/f0;

    .line 33
    .line 34
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v4, p0, Lu/d0;->s:LP/f0;

    .line 39
    .line 40
    invoke-virtual {v4}, LP/f0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance v2, Lu/S;

    .line 52
    .line 53
    invoke-direct {v2}, Lu/S;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, LP/b0;->e()F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iput v4, v2, Lu/S;->d:F

    .line 61
    .line 62
    iget-wide v4, p0, Lu/d0;->w:J

    .line 63
    .line 64
    iput-wide v4, v2, Lu/S;->g:J

    .line 65
    .line 66
    long-to-double v4, v4

    .line 67
    invoke-virtual {v1}, LP/b0;->e()F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    float-to-double v6, v6

    .line 72
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 73
    .line 74
    sub-double/2addr v8, v6

    .line 75
    mul-double/2addr v8, v4

    .line 76
    invoke-static {v8, v9}, LD5/a;->H(D)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    iput-wide v4, v2, Lu/S;->h:J

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-virtual {v1}, LP/b0;->e()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-object v5, v2, Lu/S;->e:Lu/m;

    .line 88
    .line 89
    invoke-virtual {v5, v4, v1}, Lu/m;->e(IF)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_0
    move-object v2, v3

    .line 94
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 95
    .line 96
    iget-wide v4, p0, Lu/d0;->w:J

    .line 97
    .line 98
    iput-wide v4, v2, Lu/S;->g:J

    .line 99
    .line 100
    iget-object v1, p0, Lu/d0;->D:Lr/C;

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lr/C;->a(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2}, Lu/v0;->m(Lu/S;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iput-object v3, p0, Lu/d0;->E:Lu/S;

    .line 109
    .line 110
    return-void
.end method

.method public static final q(Lu/d0;Lu/S;J)V
    .locals 8

    .line 1
    iget-wide v0, p1, Lu/S;->a:J

    .line 2
    .line 3
    add-long v3, v0, p2

    .line 4
    .line 5
    iput-wide v3, p1, Lu/S;->a:J

    .line 6
    .line 7
    iget-wide p2, p1, Lu/S;->h:J

    .line 8
    .line 9
    cmp-long p0, v3, p2

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-ltz p0, :cond_0

    .line 14
    .line 15
    iput v0, p1, Lu/S;->d:F

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v2, p1, Lu/S;->b:Lu/E0;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v5, p1, Lu/S;->e:Lu/m;

    .line 24
    .line 25
    iget-object p2, p1, Lu/S;->f:Lu/m;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    sget-object p2, Lu/d0;->I:Lu/m;

    .line 30
    .line 31
    :cond_1
    move-object v7, p2

    .line 32
    sget-object v6, Lu/d0;->J:Lu/m;

    .line 33
    .line 34
    invoke-interface/range {v2 .. v7}, Lu/B0;->g(JLu/q;Lu/q;Lu/q;)Lu/q;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lu/m;

    .line 39
    .line 40
    invoke-virtual {p2, p0}, Lu/m;->a(I)F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-static {p0, p2, v0}, LD5/a;->p(FFF)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput p0, p1, Lu/S;->d:F

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object v1, p1, Lu/S;->e:Lu/m;

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Lu/m;->a(I)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    long-to-float v1, v3

    .line 59
    long-to-float p2, p2

    .line 60
    div-float/2addr v1, p2

    .line 61
    const/4 p2, 0x1

    .line 62
    int-to-float p2, p2

    .line 63
    sub-float/2addr p2, v1

    .line 64
    mul-float/2addr p2, p0

    .line 65
    mul-float/2addr v1, v0

    .line 66
    add-float/2addr v1, p2

    .line 67
    iput v1, p1, Lu/S;->d:F

    .line 68
    .line 69
    return-void
.end method

.method public static final r(Lu/d0;Ls5/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lu/W;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lu/W;

    .line 10
    .line 11
    iget v1, v0, Lu/W;->t:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lu/W;->t:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lu/W;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lu/W;-><init>(Lu/d0;Ls5/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lu/W;->r:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lu/W;->t:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    const-wide/high16 v4, -0x8000000000000000L

    .line 35
    .line 36
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    sget-object v7, Lr5/a;->q:Lr5/a;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    if-eq v1, v3, :cond_2

    .line 43
    .line 44
    if-ne v1, v2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    :goto_1
    iget-object p0, v0, Lu/W;->q:Lu/d0;

    .line 56
    .line 57
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lu/d0;->D:Lr/C;

    .line 65
    .line 66
    invoke-virtual {p1}, Lr/C;->g()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-object p1, p0, Lu/d0;->E:Lu/S;

    .line 73
    .line 74
    if-nez p1, :cond_4

    .line 75
    .line 76
    return-object v6

    .line 77
    :cond_4
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lu/d;->m(Lq5/h;)F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    const/4 v1, 0x0

    .line 86
    cmpg-float p1, p1, v1

    .line 87
    .line 88
    if-nez p1, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, Lu/d0;->v()V

    .line 91
    .line 92
    .line 93
    iput-wide v4, p0, Lu/d0;->C:J

    .line 94
    .line 95
    return-object v6

    .line 96
    :cond_5
    iget-wide v8, p0, Lu/d0;->C:J

    .line 97
    .line 98
    cmp-long p1, v8, v4

    .line 99
    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    iget-object p1, p0, Lu/d0;->F:Lu/T;

    .line 103
    .line 104
    iput-object p0, v0, Lu/W;->q:Lu/d0;

    .line 105
    .line 106
    iput v3, v0, Lu/W;->t:I

    .line 107
    .line 108
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v1}, LP/b;->o(Lq5/h;)LP/T;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v1, p1, v0}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v7, :cond_6

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    :goto_2
    iget-object p1, p0, Lu/d0;->D:Lr/C;

    .line 124
    .line 125
    invoke-virtual {p1}, Lr/C;->h()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    iget-object p1, p0, Lu/d0;->E:Lu/S;

    .line 132
    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    iput-wide v4, p0, Lu/d0;->C:J

    .line 137
    .line 138
    return-object v6

    .line 139
    :cond_8
    :goto_3
    iput-object p0, v0, Lu/W;->q:Lu/d0;

    .line 140
    .line 141
    iput v2, v0, Lu/W;->t:I

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lu/d0;->u(Ls5/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v7, :cond_6

    .line 148
    .line 149
    :goto_4
    return-object v7
.end method

.method public static final s(Lu/d0;Ls5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lu/b0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lu/b0;

    .line 10
    .line 11
    iget v1, v0, Lu/b0;->u:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lu/b0;->u:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lu/b0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lu/b0;-><init>(Lu/d0;Ls5/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lu/b0;->s:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lu/b0;->u:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lu/b0;->r:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Lu/b0;->q:Lu/d0;

    .line 45
    .line 46
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    iget-object p0, v0, Lu/b0;->r:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, v0, Lu/b0;->q:Lu/d0;

    .line 61
    .line 62
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p1, p0

    .line 66
    move-object p0, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lu/d0;->s:LP/f0;

    .line 72
    .line 73
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v1, p0, Lu/d0;->A:LU5/c;

    .line 78
    .line 79
    iput-object p0, v0, Lu/b0;->q:Lu/d0;

    .line 80
    .line 81
    iput-object p1, v0, Lu/b0;->r:Ljava/lang/Object;

    .line 82
    .line 83
    iput v3, v0, Lu/b0;->u:I

    .line 84
    .line 85
    invoke-virtual {v1, v0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-ne v1, v4, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    iput-object p0, v0, Lu/b0;->q:Lu/d0;

    .line 93
    .line 94
    iput-object p1, v0, Lu/b0;->r:Ljava/lang/Object;

    .line 95
    .line 96
    iput v2, v0, Lu/b0;->u:I

    .line 97
    .line 98
    new-instance v1, LM5/h;

    .line 99
    .line 100
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v1, v3, v0}, LM5/h;-><init>(ILq5/c;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, LM5/h;->s()V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lu/d0;->z:LM5/h;

    .line 111
    .line 112
    iget-object v0, p0, Lu/d0;->A:LU5/c;

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-virtual {v0, v2}, LU5/c;->g(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, LM5/h;->r()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v4, :cond_5

    .line 123
    .line 124
    :goto_2
    return-object v4

    .line 125
    :cond_5
    move-object v5, v0

    .line 126
    move-object v0, p0

    .line 127
    move-object p0, p1

    .line 128
    move-object p1, v5

    .line 129
    :goto_3
    invoke-static {p1, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_6
    const-wide/high16 p0, -0x8000000000000000L

    .line 139
    .line 140
    iput-wide p0, v0, Lu/d0;->C:J

    .line 141
    .line 142
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 143
    .line 144
    const-string p1, "targetState while waiting for composition"

    .line 145
    .line 146
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0
.end method

.method public static final t(Lu/d0;Ls5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lu/c0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lu/c0;

    .line 10
    .line 11
    iget v1, v0, Lu/c0;->u:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lu/c0;->u:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lu/c0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lu/c0;-><init>(Lu/d0;Ls5/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lu/c0;->s:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lu/c0;->u:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lu/c0;->r:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Lu/c0;->q:Lu/d0;

    .line 45
    .line 46
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    iget-object p0, v0, Lu/c0;->r:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, v0, Lu/c0;->q:Lu/d0;

    .line 61
    .line 62
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lu/d0;->s:LP/f0;

    .line 70
    .line 71
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v1, p0, Lu/d0;->A:LU5/c;

    .line 76
    .line 77
    iput-object p0, v0, Lu/c0;->q:Lu/d0;

    .line 78
    .line 79
    iput-object p1, v0, Lu/c0;->r:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, v0, Lu/c0;->u:I

    .line 82
    .line 83
    invoke-virtual {v1, v0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-ne v1, v4, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v1, p0

    .line 91
    move-object p0, p1

    .line 92
    :goto_1
    iget-object p1, v1, Lu/d0;->u:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v5, v1, Lu/d0;->A:LU5/c;

    .line 95
    .line 96
    invoke-static {p0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/4 v6, 0x0

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v5, v6}, LU5/c;->g(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    iput-object v1, v0, Lu/c0;->q:Lu/d0;

    .line 108
    .line 109
    iput-object p0, v0, Lu/c0;->r:Ljava/lang/Object;

    .line 110
    .line 111
    iput v2, v0, Lu/c0;->u:I

    .line 112
    .line 113
    new-instance p1, LM5/h;

    .line 114
    .line 115
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-direct {p1, v3, v0}, LM5/h;-><init>(ILq5/c;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, LM5/h;->s()V

    .line 123
    .line 124
    .line 125
    iput-object p1, v1, Lu/d0;->z:LM5/h;

    .line 126
    .line 127
    invoke-virtual {v5, v6}, LU5/c;->g(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, LM5/h;->r()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v4, :cond_6

    .line 135
    .line 136
    :goto_2
    return-object v4

    .line 137
    :cond_6
    move-object v0, v1

    .line 138
    :goto_3
    invoke-static {p1, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    :goto_4
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    .line 148
    .line 149
    iput-wide v1, v0, Lu/d0;->C:J

    .line 150
    .line 151
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 152
    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v2, "snapTo() was canceled because state was changed to "

    .line 156
    .line 157
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string p1, " instead of "

    .line 164
    .line 165
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/d0;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/d0;->s:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu/d0;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(Lu/v0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu/d0;->v:Lu/v0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lu/d0;->v:Lu/v0;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", new instance: "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lu/P;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iput-object p1, p0, Lu/d0;->v:Lu/v0;

    .line 40
    .line 41
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lu/d0;->v:Lu/v0;

    .line 3
    .line 4
    sget-object v0, Lu/y0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La0/t;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, La0/t;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final u(Ls5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v1, v0, v1

    .line 11
    .line 12
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 13
    .line 14
    if-gtz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lu/d0;->v()V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_0
    iput v0, p0, Lu/d0;->G:F

    .line 21
    .line 22
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LP/b;->o(Lq5/h;)LP/T;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lu/d0;->H:Lu/T;

    .line 31
    .line 32
    invoke-interface {v0, v1, p1}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 37
    .line 38
    if-ne p1, v0, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    return-object v2
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu/d0;->v:Lu/v0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu/v0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lu/d0;->D:Lr/C;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr/C;->c()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lu/d0;->E:Lu/S;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lu/d0;->E:Lu/S;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lu/d0;->y(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lu/d0;->x()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final w(FLjava/lang/Object;Ls5/i;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Expecting fraction between 0 and 1. Got "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lu/P;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v5, p0, Lu/d0;->v:Lu/v0;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    move-object v4, p0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v0, p0, Lu/d0;->s:LP/f0;

    .line 37
    .line 38
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v1, Lu/Z;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v4, p0

    .line 46
    move v6, p1

    .line 47
    move-object v2, p2

    .line 48
    invoke-direct/range {v1 .. v7}, Lu/Z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/d0;Lu/v0;FLq5/c;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v4, Lu/d0;->B:Lu/O;

    .line 52
    .line 53
    invoke-static {p1, v1, p3}, Lu/O;->a(Lu/O;LB5/c;Lq5/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 58
    .line 59
    if-ne p1, p2, :cond_2

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_2
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 63
    .line 64
    return-object p1
.end method

.method public final x()V
    .locals 5

    .line 1
    iget-object v0, p0, Lu/d0;->v:Lu/v0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lu/d0;->y:LP/b0;

    .line 7
    .line 8
    invoke-virtual {v1}, LP/b0;->e()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    float-to-double v1, v1

    .line 13
    iget-object v3, v0, Lu/v0;->l:LP/C;

    .line 14
    .line 15
    invoke-virtual {v3}, LP/C;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    long-to-double v3, v3

    .line 26
    mul-double/2addr v1, v3

    .line 27
    invoke-static {v1, v2}, LD5/a;->H(D)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Lu/v0;->l(J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final y(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu/d0;->y:LP/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/b0;->f(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
