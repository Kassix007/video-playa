.class public final Lu0/g;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/E0;
.implements Lu0/a;


# instance fields
.field public E:Lu0/a;

.field public F:Lu0/d;

.field public G:Lu0/g;

.field public final H:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lu0/a;Lu0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/g;->E:Lu0/a;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lu0/d;

    .line 9
    .line 10
    invoke-direct {p2}, Lu0/d;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, Lu0/g;->F:Lu0/d;

    .line 14
    .line 15
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 16
    .line 17
    iput-object p1, p0, Lu0/g;->H:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final F(IJJ)J
    .locals 6

    .line 1
    iget-object v0, p0, Lu0/g;->E:Lu0/a;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-interface/range {v0 .. v5}, Lu0/a;->F(IJJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-boolean p3, p0, Lc0/l;->D:Z

    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    move-object p4, p3

    .line 22
    check-cast p4, Lu0/g;

    .line 23
    .line 24
    :cond_0
    move-object v0, p4

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {v2, v3, p1, p2}, Li0/b;->e(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v4, v5, p1, p2}, Li0/b;->d(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    invoke-virtual/range {v0 .. v5}, Lu0/g;->F(IJJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 p3, 0x0

    .line 41
    .line 42
    :goto_0
    invoke-static {p1, p2, p3, p4}, Li0/b;->e(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    return-wide p1
.end method

.method public final I(JLq5/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lu0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lu0/f;

    .line 7
    .line 8
    iget v1, v0, Lu0/f;->u:I

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
    iput v1, v0, Lu0/f;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu0/f;

    .line 21
    .line 22
    check-cast p3, Ls5/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lu0/f;-><init>(Lu0/g;Ls5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lu0/f;->s:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lu0/f;->u:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-wide p1, v0, Lu0/f;->r:J

    .line 43
    .line 44
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_6

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-wide p1, v0, Lu0/f;->r:J

    .line 57
    .line 58
    iget-object v1, v0, Lu0/f;->q:Lu0/g;

    .line 59
    .line 60
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-boolean p3, p0, Lc0/l;->D:Z

    .line 68
    .line 69
    if-eqz p3, :cond_4

    .line 70
    .line 71
    if-eqz p3, :cond_4

    .line 72
    .line 73
    invoke-static {p0}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lu0/g;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move-object p3, v2

    .line 81
    :goto_1
    if-eqz p3, :cond_6

    .line 82
    .line 83
    iput-object p0, v0, Lu0/f;->q:Lu0/g;

    .line 84
    .line 85
    iput-wide p1, v0, Lu0/f;->r:J

    .line 86
    .line 87
    iput v4, v0, Lu0/f;->u:I

    .line 88
    .line 89
    invoke-virtual {p3, p1, p2, v0}, Lu0/g;->I(JLq5/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-ne p3, v5, :cond_5

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    move-object v1, p0

    .line 97
    :goto_2
    check-cast p3, LW0/p;

    .line 98
    .line 99
    iget-wide v6, p3, LW0/p;->a:J

    .line 100
    .line 101
    :goto_3
    move-wide v8, v6

    .line 102
    move-wide v6, p1

    .line 103
    move-wide p1, v8

    .line 104
    goto :goto_4

    .line 105
    :cond_6
    const-wide/16 v6, 0x0

    .line 106
    .line 107
    move-object v1, p0

    .line 108
    goto :goto_3

    .line 109
    :goto_4
    iget-object p3, v1, Lu0/g;->E:Lu0/a;

    .line 110
    .line 111
    invoke-static {v6, v7, p1, p2}, LW0/p;->d(JJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    iput-object v2, v0, Lu0/f;->q:Lu0/g;

    .line 116
    .line 117
    iput-wide p1, v0, Lu0/f;->r:J

    .line 118
    .line 119
    iput v3, v0, Lu0/f;->u:I

    .line 120
    .line 121
    invoke-interface {p3, v6, v7, v0}, Lu0/a;->I(JLq5/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    if-ne p3, v5, :cond_7

    .line 126
    .line 127
    :goto_5
    return-object v5

    .line 128
    :cond_7
    :goto_6
    check-cast p3, LW0/p;

    .line 129
    .line 130
    iget-wide v0, p3, LW0/p;->a:J

    .line 131
    .line 132
    invoke-static {p1, p2, v0, v1}, LW0/p;->e(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide p1

    .line 136
    new-instance p3, LW0/p;

    .line 137
    .line 138
    invoke-direct {p3, p1, p2}, LW0/p;-><init>(J)V

    .line 139
    .line 140
    .line 141
    return-object p3
.end method

.method public final b0(IJ)J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lu0/g;

    .line 14
    .line 15
    :cond_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2, p3}, Lu0/g;->b0(IJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    :goto_0
    iget-object v2, p0, Lu0/g;->E:Lu0/a;

    .line 25
    .line 26
    invoke-static {p2, p3, v0, v1}, Li0/b;->d(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p2

    .line 30
    invoke-interface {v2, p1, p2, p3}, Lu0/a;->b0(IJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-static {v0, v1, p1, p2}, Li0/b;->e(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1
.end method

.method public final n(JJLq5/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lu0/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lu0/e;

    .line 9
    .line 10
    iget v2, v1, Lu0/e;->v:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lu0/e;->v:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lu0/e;

    .line 24
    .line 25
    check-cast v0, Ls5/c;

    .line 26
    .line 27
    invoke-direct {v1, p0, v0}, Lu0/e;-><init>(Lu0/g;Ls5/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lu0/e;->t:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v7, Lu0/e;->v:I

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    sget-object v9, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    if-ne v1, v8, :cond_1

    .line 44
    .line 45
    iget-wide v1, v7, Lu0/e;->r:J

    .line 46
    .line 47
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    iget-wide v1, v7, Lu0/e;->s:J

    .line 61
    .line 62
    iget-wide v3, v7, Lu0/e;->r:J

    .line 63
    .line 64
    iget-object v5, v7, Lu0/e;->q:Lu0/g;

    .line 65
    .line 66
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lu0/g;->E:Lu0/a;

    .line 74
    .line 75
    iput-object p0, v7, Lu0/e;->q:Lu0/g;

    .line 76
    .line 77
    iput-wide p1, v7, Lu0/e;->r:J

    .line 78
    .line 79
    move-wide v5, p3

    .line 80
    iput-wide v5, v7, Lu0/e;->s:J

    .line 81
    .line 82
    iput v2, v7, Lu0/e;->v:I

    .line 83
    .line 84
    move-wide v3, p1

    .line 85
    move-object v2, v0

    .line 86
    invoke-interface/range {v2 .. v7}, Lu0/a;->n(JJLq5/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v9, :cond_4

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move-object v5, p0

    .line 94
    move-wide v3, p1

    .line 95
    move-wide v1, p3

    .line 96
    :goto_2
    check-cast v0, LW0/p;

    .line 97
    .line 98
    iget-wide v10, v0, LW0/p;->a:J

    .line 99
    .line 100
    iget-boolean v0, v5, Lc0/l;->D:Z

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-static {v5}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lu0/g;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move-object v0, v6

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iget-object v0, v5, Lu0/g;->G:Lu0/g;

    .line 119
    .line 120
    :goto_3
    if-eqz v0, :cond_8

    .line 121
    .line 122
    invoke-static {v3, v4, v10, v11}, LW0/p;->e(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    invoke-static {v1, v2, v10, v11}, LW0/p;->d(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v1

    .line 130
    iput-object v6, v7, Lu0/e;->q:Lu0/g;

    .line 131
    .line 132
    iput-wide v10, v7, Lu0/e;->r:J

    .line 133
    .line 134
    iput v8, v7, Lu0/e;->v:I

    .line 135
    .line 136
    move-wide v5, v1

    .line 137
    move-object v2, v0

    .line 138
    invoke-virtual/range {v2 .. v7}, Lu0/g;->n(JJLq5/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-ne v0, v9, :cond_7

    .line 143
    .line 144
    :goto_4
    return-object v9

    .line 145
    :cond_7
    move-wide v1, v10

    .line 146
    :goto_5
    check-cast v0, LW0/p;

    .line 147
    .line 148
    iget-wide v3, v0, LW0/p;->a:J

    .line 149
    .line 150
    move-wide v10, v1

    .line 151
    goto :goto_6

    .line 152
    :cond_8
    const-wide/16 v3, 0x0

    .line 153
    .line 154
    :goto_6
    invoke-static {v10, v11, v3, v4}, LW0/p;->e(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v0

    .line 158
    new-instance v2, LW0/p;

    .line 159
    .line 160
    invoke-direct {v2, v0, v1}, LW0/p;-><init>(J)V

    .line 161
    .line 162
    .line 163
    return-object v2
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/g;->H:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/g;->F:Lu0/d;

    .line 2
    .line 3
    iput-object p0, v0, Lu0/d;->a:Lu0/g;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lu0/d;->b:Lu0/g;

    .line 7
    .line 8
    iput-object v1, p0, Lu0/g;->G:Lu0/g;

    .line 9
    .line 10
    new-instance v1, LA0/d;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    invoke-direct {v1, v2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lu0/d;->c:Lkotlin/jvm/internal/n;

    .line 18
    .line 19
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lu0/d;->d:LM5/w;

    .line 24
    .line 25
    return-void
.end method

.method public final q0()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LC0/v;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, v0, v2}, LC0/v;-><init>(Lkotlin/jvm/internal/y;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, LB0/g;->x(LB0/E0;LB5/c;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LB0/E0;

    .line 18
    .line 19
    check-cast v0, Lu0/g;

    .line 20
    .line 21
    iput-object v0, p0, Lu0/g;->G:Lu0/g;

    .line 22
    .line 23
    iget-object v1, p0, Lu0/g;->F:Lu0/d;

    .line 24
    .line 25
    iput-object v0, v1, Lu0/d;->b:Lu0/g;

    .line 26
    .line 27
    iget-object v0, v1, Lu0/d;->a:Lu0/g;

    .line 28
    .line 29
    if-ne v0, p0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, v1, Lu0/d;->a:Lu0/g;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final x0()LM5/w;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu0/g;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lu0/g;->x0()LM5/w;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_1
    iget-object v0, p0, Lu0/g;->F:Lu0/d;

    .line 21
    .line 22
    iget-object v0, v0, Lu0/d;->d:LM5/w;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method
