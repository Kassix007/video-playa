.class public final LM2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LI2/y;

.field public final b:LY2/a;

.field public final c:LB0/o;

.field public final d:Lk3/c;


# direct methods
.method public constructor <init>(LI2/y;LY2/a;LB0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/h;->a:LI2/y;

    .line 5
    .line 6
    iput-object p2, p0, LM2/h;->b:LY2/a;

    .line 7
    .line 8
    iput-object p3, p0, LM2/h;->c:LB0/o;

    .line 9
    .line 10
    new-instance p2, Lk3/c;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p2, Lk3/c;->q:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p2, p0, LM2/h;->d:Lk3/c;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(LM2/h;LL2/i;LI2/g;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p7, LM2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p7

    .line 6
    check-cast v0, LM2/b;

    .line 7
    .line 8
    iget v1, v0, LM2/b;->z:I

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
    iput v1, v0, LM2/b;->z:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LM2/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, LM2/b;-><init>(LM2/h;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, LM2/b;->x:Ljava/lang/Object;

    .line 26
    .line 27
    iget p7, v0, LM2/b;->z:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p7, :cond_2

    .line 32
    .line 33
    if-ne p7, v2, :cond_1

    .line 34
    .line 35
    iget p1, v0, LM2/b;->w:I

    .line 36
    .line 37
    iget-object p2, v0, LM2/b;->v:LI2/i;

    .line 38
    .line 39
    iget-object p3, v0, LM2/b;->u:LU2/n;

    .line 40
    .line 41
    iget-object p4, v0, LM2/b;->t:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p5, v0, LM2/b;->s:LU2/g;

    .line 44
    .line 45
    iget-object p6, v0, LM2/b;->r:LI2/g;

    .line 46
    .line 47
    iget-object p7, v0, LM2/b;->q:LL2/i;

    .line 48
    .line 49
    invoke-static {p0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v4, p6

    .line 53
    move-object p6, p2

    .line 54
    move-object p2, v4

    .line 55
    move-object v4, p5

    .line 56
    move-object p5, p3

    .line 57
    move-object p3, v4

    .line 58
    goto :goto_4

    .line 59
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    invoke-static {p0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    :goto_1
    iget-object p7, p2, LI2/g;->g:Lm5/o;

    .line 72
    .line 73
    invoke-virtual {p7}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p7

    .line 77
    check-cast p7, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p7}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result p7

    .line 83
    :goto_2
    if-ge p0, p7, :cond_4

    .line 84
    .line 85
    iget-object v3, p2, LI2/g;->g:Lm5/o;

    .line 86
    .line 87
    invoke-virtual {v3}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, LJ2/j;

    .line 98
    .line 99
    invoke-interface {v3, p1, p5}, LJ2/j;->a(LL2/i;LU2/n;)LJ2/k;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance p7, Lm5/j;

    .line 110
    .line 111
    invoke-direct {p7, v3, p0}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object p7, v1

    .line 119
    :goto_3
    if-eqz p7, :cond_9

    .line 120
    .line 121
    iget-object p0, p7, Lm5/j;->q:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, LJ2/k;

    .line 124
    .line 125
    iget-object p7, p7, Lm5/j;->r:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p7, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p7

    .line 133
    add-int/2addr p7, v2

    .line 134
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iput-object p1, v0, LM2/b;->q:LL2/i;

    .line 138
    .line 139
    iput-object p2, v0, LM2/b;->r:LI2/g;

    .line 140
    .line 141
    iput-object p3, v0, LM2/b;->s:LU2/g;

    .line 142
    .line 143
    iput-object p4, v0, LM2/b;->t:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object p5, v0, LM2/b;->u:LU2/n;

    .line 146
    .line 147
    iput-object p6, v0, LM2/b;->v:LI2/i;

    .line 148
    .line 149
    iput p7, v0, LM2/b;->w:I

    .line 150
    .line 151
    iput v2, v0, LM2/b;->z:I

    .line 152
    .line 153
    invoke-interface {p0, v0}, LJ2/k;->a(Lq5/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    sget-object v3, Lr5/a;->q:Lr5/a;

    .line 158
    .line 159
    if-ne p0, v3, :cond_5

    .line 160
    .line 161
    return-object v3

    .line 162
    :cond_5
    move v4, p7

    .line 163
    move-object p7, p1

    .line 164
    move p1, v4

    .line 165
    :goto_4
    check-cast p0, LJ2/i;

    .line 166
    .line 167
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    new-instance p1, LM2/a;

    .line 173
    .line 174
    iget-object p2, p0, LJ2/i;->a:LI2/n;

    .line 175
    .line 176
    iget-boolean p0, p0, LJ2/i;->b:Z

    .line 177
    .line 178
    iget-object p3, p7, LL2/i;->c:LJ2/h;

    .line 179
    .line 180
    iget-object p4, p7, LL2/i;->a:LJ2/q;

    .line 181
    .line 182
    instance-of p5, p4, LJ2/p;

    .line 183
    .line 184
    if-eqz p5, :cond_6

    .line 185
    .line 186
    check-cast p4, LJ2/p;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_6
    move-object p4, v1

    .line 190
    :goto_5
    if-eqz p4, :cond_7

    .line 191
    .line 192
    iget-object v1, p4, LJ2/p;->s:Ljava/lang/String;

    .line 193
    .line 194
    :cond_7
    invoke-direct {p1, p2, p0, p3, v1}, LM2/a;-><init>(LI2/n;ZLJ2/h;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_8
    move p0, p1

    .line 199
    move-object p1, p7

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string p1, "Unable to create a decoder that supports: "

    .line 205
    .line 206
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p1
.end method

.method public static final b(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    instance-of v2, v1, LM2/c;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, LM2/c;

    .line 9
    .line 10
    iget v3, v2, LM2/c;->z:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, LM2/c;->z:I

    .line 20
    .line 21
    :goto_0
    move-object v6, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, LM2/c;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, LM2/c;-><init>(LM2/h;Ls5/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v1, v6, LM2/c;->x:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v6, LM2/c;->z:I

    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    const/4 v10, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v11, 0x0

    .line 37
    sget-object v12, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v3, :cond_3

    .line 42
    .line 43
    if-eq v2, v10, :cond_2

    .line 44
    .line 45
    if-ne v2, v9, :cond_1

    .line 46
    .line 47
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_9

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
    iget-object v2, v6, LM2/c;->t:Lkotlin/jvm/internal/y;

    .line 61
    .line 62
    iget-object v0, v6, LM2/c;->s:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lkotlin/jvm/internal/y;

    .line 65
    .line 66
    iget-object v3, v6, LM2/c;->r:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, LI2/i;

    .line 69
    .line 70
    iget-object v4, v6, LM2/c;->q:LU2/g;

    .line 71
    .line 72
    :try_start_0
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    move-object v14, v6

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto/16 :goto_a

    .line 80
    .line 81
    :cond_3
    iget-object v2, v6, LM2/c;->w:Lkotlin/jvm/internal/y;

    .line 82
    .line 83
    iget-object v3, v6, LM2/c;->v:Lkotlin/jvm/internal/y;

    .line 84
    .line 85
    iget-object v4, v6, LM2/c;->u:Lkotlin/jvm/internal/y;

    .line 86
    .line 87
    iget-object v5, v6, LM2/c;->t:Lkotlin/jvm/internal/y;

    .line 88
    .line 89
    iget-object v7, v6, LM2/c;->s:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v7, LI2/i;

    .line 92
    .line 93
    iget-object v8, v6, LM2/c;->r:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v13, v6, LM2/c;->q:LU2/g;

    .line 96
    .line 97
    :try_start_1
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    .line 100
    move-object v14, v6

    .line 101
    move-object v6, v5

    .line 102
    move-object v5, v8

    .line 103
    move-object v8, v4

    .line 104
    move-object v4, v13

    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object v2, v3

    .line 109
    goto/16 :goto_a

    .line 110
    .line 111
    :cond_4
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v7, Lkotlin/jvm/internal/y;

    .line 115
    .line 116
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    move-object/from16 v1, p3

    .line 120
    .line 121
    iput-object v1, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 122
    .line 123
    new-instance v8, Lkotlin/jvm/internal/y;

    .line 124
    .line 125
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, LM2/h;->a:LI2/y;

    .line 129
    .line 130
    iget-object v1, v1, LI2/y;->c:LI2/g;

    .line 131
    .line 132
    iput-object v1, v8, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance v13, Lkotlin/jvm/internal/y;

    .line 135
    .line 136
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    :try_start_2
    iget-object v1, p0, LM2/h;->c:LB0/o;

    .line 140
    .line 141
    iget-object v2, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, LU2/n;

    .line 144
    .line 145
    invoke-virtual {v1, v2}, LB0/o;->H(LU2/n;)LU2/n;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iput-object v1, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v1, v8, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, LI2/g;

    .line 157
    .line 158
    iget-object v2, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 159
    .line 160
    move-object v4, v2

    .line 161
    check-cast v4, LU2/n;

    .line 162
    .line 163
    move-object/from16 v2, p1

    .line 164
    .line 165
    iput-object v2, v6, LM2/c;->q:LU2/g;

    .line 166
    .line 167
    move-object/from16 v5, p2

    .line 168
    .line 169
    iput-object v5, v6, LM2/c;->r:Ljava/lang/Object;

    .line 170
    .line 171
    move-object/from16 v14, p4

    .line 172
    .line 173
    iput-object v14, v6, LM2/c;->s:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v7, v6, LM2/c;->t:Lkotlin/jvm/internal/y;

    .line 176
    .line 177
    iput-object v8, v6, LM2/c;->u:Lkotlin/jvm/internal/y;

    .line 178
    .line 179
    iput-object v13, v6, LM2/c;->v:Lkotlin/jvm/internal/y;

    .line 180
    .line 181
    iput-object v13, v6, LM2/c;->w:Lkotlin/jvm/internal/y;

    .line 182
    .line 183
    iput v3, v6, LM2/c;->z:I

    .line 184
    .line 185
    move-object v0, p0

    .line 186
    move-object v3, v5

    .line 187
    move-object v5, v14

    .line 188
    invoke-virtual/range {v0 .. v6}, LM2/h;->c(LI2/g;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 192
    move-object v14, v6

    .line 193
    if-ne v1, v12, :cond_5

    .line 194
    .line 195
    goto/16 :goto_8

    .line 196
    .line 197
    :cond_5
    move-object/from16 v4, p1

    .line 198
    .line 199
    move-object/from16 v5, p2

    .line 200
    .line 201
    move-object v6, v7

    .line 202
    move-object v2, v13

    .line 203
    move-object v3, v2

    .line 204
    move-object/from16 v7, p4

    .line 205
    .line 206
    :goto_2
    :try_start_3
    iput-object v1, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 207
    .line 208
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v1, v0

    .line 211
    check-cast v1, LL2/e;

    .line 212
    .line 213
    instance-of v2, v1, LL2/i;

    .line 214
    .line 215
    if-eqz v2, :cond_7

    .line 216
    .line 217
    iget-object v13, v4, LU2/g;->g:Lq5/h;

    .line 218
    .line 219
    new-instance v0, LM2/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 220
    .line 221
    move-object v2, v3

    .line 222
    move-object v3, v8

    .line 223
    const/4 v8, 0x0

    .line 224
    move-object v1, p0

    .line 225
    :try_start_4
    invoke-direct/range {v0 .. v8}, LM2/d;-><init>(LM2/h;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;LU2/g;Ljava/lang/Object;Lkotlin/jvm/internal/y;LI2/i;Lq5/c;)V

    .line 226
    .line 227
    .line 228
    iput-object v4, v14, LM2/c;->q:LU2/g;

    .line 229
    .line 230
    iput-object v7, v14, LM2/c;->r:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v6, v14, LM2/c;->s:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v2, v14, LM2/c;->t:Lkotlin/jvm/internal/y;

    .line 235
    .line 236
    iput-object v11, v14, LM2/c;->u:Lkotlin/jvm/internal/y;

    .line 237
    .line 238
    iput-object v11, v14, LM2/c;->v:Lkotlin/jvm/internal/y;

    .line 239
    .line 240
    iput-object v11, v14, LM2/c;->w:Lkotlin/jvm/internal/y;

    .line 241
    .line 242
    iput v10, v14, LM2/c;->z:I

    .line 243
    .line 244
    invoke-static {v13, v0, v14}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-ne v1, v12, :cond_6

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_6
    move-object v0, v6

    .line 252
    move-object v3, v7

    .line 253
    :goto_3
    check-cast v1, LM2/a;

    .line 254
    .line 255
    move-object v6, v0

    .line 256
    move-object v7, v3

    .line 257
    :goto_4
    move-object v3, v2

    .line 258
    goto :goto_5

    .line 259
    :cond_7
    move-object v2, v3

    .line 260
    instance-of v1, v1, LL2/h;

    .line 261
    .line 262
    if-eqz v1, :cond_c

    .line 263
    .line 264
    new-instance v1, LM2/a;

    .line 265
    .line 266
    move-object v3, v0

    .line 267
    check-cast v3, LL2/h;

    .line 268
    .line 269
    iget-object v3, v3, LL2/h;->a:LI2/n;

    .line 270
    .line 271
    move-object v5, v0

    .line 272
    check-cast v5, LL2/h;

    .line 273
    .line 274
    iget-boolean v5, v5, LL2/h;->b:Z

    .line 275
    .line 276
    check-cast v0, LL2/h;

    .line 277
    .line 278
    iget-object v0, v0, LL2/h;->c:LJ2/h;

    .line 279
    .line 280
    invoke-direct {v1, v3, v5, v0, v11}, LM2/a;-><init>(LI2/n;ZLJ2/h;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :goto_5
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 285
    .line 286
    instance-of v2, v0, LL2/i;

    .line 287
    .line 288
    if-eqz v2, :cond_8

    .line 289
    .line 290
    check-cast v0, LL2/i;

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_8
    move-object v0, v11

    .line 294
    :goto_6
    if-eqz v0, :cond_9

    .line 295
    .line 296
    iget-object v0, v0, LL2/i;->a:LJ2/q;

    .line 297
    .line 298
    if-eqz v0, :cond_9

    .line 299
    .line 300
    :try_start_5
    invoke-static {v0}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 301
    .line 302
    .line 303
    goto :goto_7

    .line 304
    :catch_0
    move-exception v0

    .line 305
    throw v0

    .line 306
    :catch_1
    :cond_9
    :goto_7
    iget-object v0, v6, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, LU2/n;

    .line 309
    .line 310
    iput-object v11, v14, LM2/c;->q:LU2/g;

    .line 311
    .line 312
    iput-object v11, v14, LM2/c;->r:Ljava/lang/Object;

    .line 313
    .line 314
    iput-object v11, v14, LM2/c;->s:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v11, v14, LM2/c;->t:Lkotlin/jvm/internal/y;

    .line 317
    .line 318
    iput-object v11, v14, LM2/c;->u:Lkotlin/jvm/internal/y;

    .line 319
    .line 320
    iput-object v11, v14, LM2/c;->v:Lkotlin/jvm/internal/y;

    .line 321
    .line 322
    iput-object v11, v14, LM2/c;->w:Lkotlin/jvm/internal/y;

    .line 323
    .line 324
    iput v9, v14, LM2/c;->z:I

    .line 325
    .line 326
    invoke-static {v1, v4, v0, v7, v14}, La/a;->V(LM2/a;LU2/g;LU2/n;LI2/i;Ls5/c;)LM2/a;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    if-ne v1, v12, :cond_a

    .line 331
    .line 332
    :goto_8
    return-object v12

    .line 333
    :cond_a
    :goto_9
    check-cast v1, LM2/a;

    .line 334
    .line 335
    iget-object v0, v1, LM2/a;->a:LI2/n;

    .line 336
    .line 337
    sget-object v2, LY2/j;->a:[Landroid/graphics/Bitmap$Config;

    .line 338
    .line 339
    instance-of v2, v0, LI2/a;

    .line 340
    .line 341
    if-eqz v2, :cond_b

    .line 342
    .line 343
    check-cast v0, LI2/a;

    .line 344
    .line 345
    iget-object v0, v0, LI2/a;->a:Landroid/graphics/Bitmap;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 348
    .line 349
    .line 350
    :cond_b
    return-object v1

    .line 351
    :cond_c
    :try_start_6
    new-instance v0, LC2/e;

    .line 352
    .line 353
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 354
    .line 355
    .line 356
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 357
    :catchall_2
    move-exception v0

    .line 358
    move-object v2, v13

    .line 359
    :goto_a
    iget-object v1, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 360
    .line 361
    instance-of v2, v1, LL2/i;

    .line 362
    .line 363
    if-eqz v2, :cond_d

    .line 364
    .line 365
    move-object v11, v1

    .line 366
    check-cast v11, LL2/i;

    .line 367
    .line 368
    :cond_d
    if-eqz v11, :cond_e

    .line 369
    .line 370
    iget-object v1, v11, LL2/i;->a:LJ2/q;

    .line 371
    .line 372
    if-eqz v1, :cond_e

    .line 373
    .line 374
    :try_start_7
    invoke-static {v1}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 375
    .line 376
    .line 377
    goto :goto_b

    .line 378
    :catch_2
    move-exception v0

    .line 379
    throw v0

    .line 380
    :catch_3
    :cond_e
    :goto_b
    throw v0
.end method


# virtual methods
.method public final c(LI2/g;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p6, LM2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, LM2/e;

    .line 7
    .line 8
    iget v1, v0, LM2/e;->y:I

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
    iput v1, v0, LM2/e;->y:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LM2/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, LM2/e;-><init>(LM2/h;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, LM2/e;->w:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LM2/e;->y:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget p1, v0, LM2/e;->v:I

    .line 36
    .line 37
    iget-object p2, v0, LM2/e;->u:LI2/i;

    .line 38
    .line 39
    iget-object p3, v0, LM2/e;->t:LU2/n;

    .line 40
    .line 41
    iget-object p4, v0, LM2/e;->s:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p5, v0, LM2/e;->r:LU2/g;

    .line 44
    .line 45
    iget-object v1, v0, LM2/e;->q:LI2/g;

    .line 46
    .line 47
    invoke-static {p6}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v6, v1

    .line 51
    move v1, p1

    .line 52
    move-object p1, v6

    .line 53
    move-object v6, p5

    .line 54
    move-object p5, p2

    .line 55
    move-object p2, v6

    .line 56
    move-object v6, p4

    .line 57
    move-object p4, p3

    .line 58
    move-object p3, v6

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    invoke-static {p6}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 p6, 0x0

    .line 73
    :goto_1
    iget-object v1, p1, LI2/g;->f:Lm5/o;

    .line 74
    .line 75
    invoke-virtual {v1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    :goto_2
    if-ge p6, v1, :cond_4

    .line 86
    .line 87
    iget-object v4, p1, LI2/g;->f:Lm5/o;

    .line 88
    .line 89
    invoke-virtual {v4}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v4, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lm5/j;

    .line 100
    .line 101
    iget-object v5, v4, Lm5/j;->q:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, LL2/f;

    .line 104
    .line 105
    iget-object v4, v4, Lm5/j;->r:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, LH5/c;

    .line 108
    .line 109
    check-cast v4, Lkotlin/jvm/internal/f;

    .line 110
    .line 111
    invoke-virtual {v4, p3}, Lkotlin/jvm/internal/f;->d(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_3

    .line 116
    .line 117
    const-string v4, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>"

    .line 118
    .line 119
    invoke-static {v5, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object v4, p0, LM2/h;->a:LI2/y;

    .line 123
    .line 124
    invoke-interface {v5, p3, p4, v4}, LL2/f;->a(Ljava/lang/Object;LU2/n;LI2/y;)LL2/g;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p6

    .line 134
    new-instance v1, Lm5/j;

    .line 135
    .line 136
    invoke-direct {v1, v4, p6}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    add-int/lit8 p6, p6, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    move-object v1, v2

    .line 144
    :goto_3
    if-eqz v1, :cond_9

    .line 145
    .line 146
    iget-object p6, v1, Lm5/j;->q:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p6, LL2/g;

    .line 149
    .line 150
    iget-object v1, v1, Lm5/j;->r:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/2addr v1, v3

    .line 159
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iput-object p1, v0, LM2/e;->q:LI2/g;

    .line 163
    .line 164
    iput-object p2, v0, LM2/e;->r:LU2/g;

    .line 165
    .line 166
    iput-object p3, v0, LM2/e;->s:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object p4, v0, LM2/e;->t:LU2/n;

    .line 169
    .line 170
    iput-object p5, v0, LM2/e;->u:LI2/i;

    .line 171
    .line 172
    iput v1, v0, LM2/e;->v:I

    .line 173
    .line 174
    iput v3, v0, LM2/e;->y:I

    .line 175
    .line 176
    invoke-interface {p6, v0}, LL2/g;->a(Lq5/c;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p6

    .line 180
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 181
    .line 182
    if-ne p6, v4, :cond_5

    .line 183
    .line 184
    return-object v4

    .line 185
    :cond_5
    :goto_4
    check-cast p6, LL2/e;

    .line 186
    .line 187
    :try_start_0
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    .line 189
    .line 190
    if-eqz p6, :cond_6

    .line 191
    .line 192
    return-object p6

    .line 193
    :cond_6
    move p6, v1

    .line 194
    goto :goto_1

    .line 195
    :catchall_0
    move-exception p1

    .line 196
    instance-of p2, p6, LL2/i;

    .line 197
    .line 198
    if-eqz p2, :cond_7

    .line 199
    .line 200
    move-object v2, p6

    .line 201
    check-cast v2, LL2/i;

    .line 202
    .line 203
    :cond_7
    if-eqz v2, :cond_8

    .line 204
    .line 205
    iget-object p2, v2, LL2/i;->a:LJ2/q;

    .line 206
    .line 207
    if-eqz p2, :cond_8

    .line 208
    .line 209
    :try_start_1
    invoke-static {p2}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :catch_0
    move-exception p1

    .line 214
    throw p1

    .line 215
    :catch_1
    :cond_8
    :goto_5
    throw p1

    .line 216
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string p2, "Unable to create a fetcher that supports: "

    .line 219
    .line 220
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p2
.end method

.method public final d(LM2/k;Ls5/c;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, LM2/h;->d:Lk3/c;

    .line 8
    .line 9
    instance-of v3, v0, LM2/f;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, LM2/f;

    .line 15
    .line 16
    iget v4, v3, LM2/f;->t:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, LM2/f;->t:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, LM2/f;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, LM2/f;-><init>(LM2/h;Ls5/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v9, LM2/f;->r:Ljava/lang/Object;

    .line 36
    .line 37
    iget v3, v9, LM2/f;->t:I

    .line 38
    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    if-ne v3, v10, :cond_1

    .line 43
    .line 44
    iget-object v2, v9, LM2/f;->q:LM2/k;

    .line 45
    .line 46
    :try_start_0
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object v7, v2

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :try_start_1
    iget-object v0, v7, LM2/k;->e:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v13, v0

    .line 68
    check-cast v13, LU2/g;

    .line 69
    .line 70
    iget-object v0, v13, LU2/g;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v3, v7, LM2/k;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, LV2/h;

    .line 75
    .line 76
    iget-object v4, v7, LM2/k;->g:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v5, v4

    .line 79
    check-cast v5, LI2/i;

    .line 80
    .line 81
    iget-object v4, v1, LM2/h;->c:LB0/o;

    .line 82
    .line 83
    invoke-virtual {v4, v13, v3}, LB0/o;->G(LU2/g;LV2/h;)LU2/n;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v6, v4, LU2/n;->c:LV2/g;

    .line 88
    .line 89
    iget-object v8, v1, LM2/h;->a:LI2/y;

    .line 90
    .line 91
    iget-object v8, v8, LI2/y;->c:LI2/g;

    .line 92
    .line 93
    iget-object v8, v8, LI2/g;->b:Ljava/util/List;

    .line 94
    .line 95
    move-object v11, v8

    .line 96
    check-cast v11, Ljava/util/Collection;

    .line 97
    .line 98
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    const/4 v14, 0x0

    .line 103
    :goto_2
    if-ge v14, v11, :cond_4

    .line 104
    .line 105
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    check-cast v15, Lm5/j;

    .line 110
    .line 111
    iget-object v12, v15, Lm5/j;->q:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v12, LO2/a;

    .line 114
    .line 115
    iget-object v15, v15, Lm5/j;->r:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v15, LH5/c;

    .line 118
    .line 119
    check-cast v15, Lkotlin/jvm/internal/f;

    .line 120
    .line 121
    invoke-virtual {v15, v0}, Lkotlin/jvm/internal/f;->d(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    if-eqz v15, :cond_3

    .line 126
    .line 127
    const-string v15, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>"

    .line 128
    .line 129
    invoke-static {v12, v15}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v4}, LO2/a;->a(Ljava/lang/Object;LU2/n;)LI2/B;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    if-eqz v12, :cond_3

    .line 137
    .line 138
    move-object v0, v12

    .line 139
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-virtual {v2, v13, v0, v4, v5}, Lk3/c;->p(LU2/g;Ljava/lang/Object;LU2/n;LI2/i;)LP2/a;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    const/4 v8, 0x0

    .line 147
    if-eqz v15, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2, v13, v15, v3, v6}, Lk3/c;->i(LU2/g;LP2/a;LV2/h;LV2/g;)LP2/b;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    goto :goto_3

    .line 154
    :catchall_1
    move-exception v0

    .line 155
    goto :goto_6

    .line 156
    :cond_5
    move-object v2, v8

    .line 157
    :goto_3
    if-eqz v2, :cond_9

    .line 158
    .line 159
    iget-object v0, v2, LP2/b;->b:Ljava/util/Map;

    .line 160
    .line 161
    new-instance v11, LU2/p;

    .line 162
    .line 163
    iget-object v12, v2, LP2/b;->a:LI2/n;

    .line 164
    .line 165
    sget-object v14, LJ2/h;->q:LJ2/h;

    .line 166
    .line 167
    const-string v2, "coil#disk_cache_key"

    .line 168
    .line 169
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    instance-of v3, v2, Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    check-cast v2, Ljava/lang/String;

    .line 178
    .line 179
    move-object/from16 v16, v2

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_6
    move-object/from16 v16, v8

    .line 183
    .line 184
    :goto_4
    const-string v2, "coil#is_sampled"

    .line 185
    .line 186
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 191
    .line 192
    if-eqz v2, :cond_7

    .line 193
    .line 194
    move-object v8, v0

    .line 195
    check-cast v8, Ljava/lang/Boolean;

    .line 196
    .line 197
    :cond_7
    if-eqz v8, :cond_8

    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    move/from16 v17, v0

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_8
    const/16 v17, 0x0

    .line 207
    .line 208
    :goto_5
    iget-boolean v0, v7, LM2/k;->c:Z

    .line 209
    .line 210
    move/from16 v18, v0

    .line 211
    .line 212
    invoke-direct/range {v11 .. v18}, LU2/p;-><init>(LI2/n;LU2/g;LJ2/h;LP2/a;Ljava/lang/String;ZZ)V

    .line 213
    .line 214
    .line 215
    return-object v11

    .line 216
    :cond_9
    iget-object v11, v13, LU2/g;->f:Lq5/h;

    .line 217
    .line 218
    move-object v3, v0

    .line 219
    new-instance v0, LM2/g;

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    move-object v2, v13

    .line 223
    move-object v6, v15

    .line 224
    invoke-direct/range {v0 .. v8}, LM2/g;-><init>(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;LP2/a;LM2/k;Lq5/c;)V

    .line 225
    .line 226
    .line 227
    iput-object v7, v9, LM2/f;->q:LM2/k;

    .line 228
    .line 229
    iput v10, v9, LM2/f;->t:I

    .line 230
    .line 231
    invoke-static {v11, v0, v9}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 236
    .line 237
    if-ne v0, v1, :cond_a

    .line 238
    .line 239
    return-object v1

    .line 240
    :cond_a
    return-object v0

    .line 241
    :goto_6
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 242
    .line 243
    if-nez v1, :cond_b

    .line 244
    .line 245
    iget-object v1, v7, LM2/k;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, LU2/g;

    .line 248
    .line 249
    invoke-static {v1, v0}, LQ2/g;->b(LU2/g;Ljava/lang/Throwable;)LU2/c;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    return-object v0

    .line 254
    :cond_b
    throw v0
.end method
