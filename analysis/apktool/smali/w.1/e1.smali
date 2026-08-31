.class public final Lw/e1;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lv0/g;

.field public final synthetic u:Lkotlin/jvm/internal/y;


# direct methods
.method public constructor <init>(Lv0/g;Lkotlin/jvm/internal/y;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/e1;->t:Lv0/g;

    .line 2
    .line 3
    iput-object p2, p0, Lw/e1;->u:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/h;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lw/e1;

    .line 2
    .line 3
    iget-object v1, p0, Lw/e1;->t:Lv0/g;

    .line 4
    .line 5
    iget-object v2, p0, Lw/e1;->u:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lw/e1;-><init>(Lv0/g;Lkotlin/jvm/internal/y;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv0/y;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/e1;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/e1;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/e1;->r:I

    .line 4
    .line 5
    sget-object v2, Lw/L;->a:Lw/L;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, v0, Lw/e1;->u:Lkotlin/jvm/internal/y;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    sget-object v7, Lr5/a;->q:Lr5/a;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v6, :cond_1

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lv0/y;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v8, p1

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    iget-object v1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lv0/y;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v8, p1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lv0/y;

    .line 55
    .line 56
    :cond_3
    iput-object v1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 57
    .line 58
    iput v6, v0, Lw/e1;->r:I

    .line 59
    .line 60
    iget-object v8, v0, Lw/e1;->t:Lv0/g;

    .line 61
    .line 62
    invoke-virtual {v1, v8, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    if-ne v8, v7, :cond_4

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_4
    :goto_0
    check-cast v8, Lv0/f;

    .line 71
    .line 72
    iget-object v9, v8, Lv0/f;->a:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v10, v9

    .line 75
    check-cast v10, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    move v11, v5

    .line 82
    :goto_1
    if-ge v11, v10, :cond_f

    .line 83
    .line 84
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    check-cast v12, Lv0/l;

    .line 89
    .line 90
    invoke-static {v12}, Lv0/v;->b(Lv0/l;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-nez v12, :cond_e

    .line 95
    .line 96
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    const/16 v11, 0x1d

    .line 99
    .line 100
    if-lt v10, v11, :cond_6

    .line 101
    .line 102
    iget-object v8, v8, Lv0/f;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 103
    .line 104
    if-eqz v8, :cond_5

    .line 105
    .line 106
    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/O1;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, LZ/m;

    .line 109
    .line 110
    iget-object v8, v8, LZ/m;->s:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v8, Landroid/view/MotionEvent;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    const/4 v8, 0x0

    .line 116
    :goto_2
    if-eqz v8, :cond_6

    .line 117
    .line 118
    invoke-static {v8}, Lt1/a;->b(Landroid/view/MotionEvent;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    move v8, v5

    .line 124
    :goto_3
    if-ne v8, v3, :cond_7

    .line 125
    .line 126
    move v8, v6

    .line 127
    goto :goto_4

    .line 128
    :cond_7
    move v8, v5

    .line 129
    :goto_4
    if-eqz v8, :cond_8

    .line 130
    .line 131
    sget-object v1, Lw/N;->a:Lw/N;

    .line 132
    .line 133
    iput-object v1, v4, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 134
    .line 135
    goto/16 :goto_a

    .line 136
    .line 137
    :cond_8
    move-object v8, v9

    .line 138
    check-cast v8, Ljava/util/Collection;

    .line 139
    .line 140
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    move v10, v5

    .line 145
    :goto_5
    if-ge v10, v8, :cond_b

    .line 146
    .line 147
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    check-cast v11, Lv0/l;

    .line 152
    .line 153
    invoke-virtual {v11}, Lv0/l;->b()Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-nez v12, :cond_a

    .line 158
    .line 159
    iget-object v12, v1, Lv0/y;->v:Lv0/A;

    .line 160
    .line 161
    iget-wide v12, v12, Lv0/A;->N:J

    .line 162
    .line 163
    invoke-virtual {v1}, Lv0/y;->c()J

    .line 164
    .line 165
    .line 166
    move-result-wide v14

    .line 167
    invoke-static {v11, v12, v13, v14, v15}, Lv0/v;->e(Lv0/l;JJ)Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_9

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    :goto_6
    iput-object v2, v4, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 178
    .line 179
    goto :goto_a

    .line 180
    :cond_b
    iput-object v1, v0, Lw/e1;->s:Ljava/lang/Object;

    .line 181
    .line 182
    iput v3, v0, Lw/e1;->r:I

    .line 183
    .line 184
    sget-object v8, Lv0/g;->s:Lv0/g;

    .line 185
    .line 186
    invoke-virtual {v1, v8, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    if-ne v8, v7, :cond_c

    .line 191
    .line 192
    :goto_7
    return-object v7

    .line 193
    :cond_c
    :goto_8
    check-cast v8, Lv0/f;

    .line 194
    .line 195
    iget-object v8, v8, Lv0/f;->a:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v9, v8

    .line 198
    check-cast v9, Ljava/util/Collection;

    .line 199
    .line 200
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    move v10, v5

    .line 205
    :goto_9
    if-ge v10, v9, :cond_3

    .line 206
    .line 207
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, Lv0/l;

    .line 212
    .line 213
    invoke-virtual {v11}, Lv0/l;->b()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-eqz v11, :cond_d

    .line 218
    .line 219
    iput-object v2, v4, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_e
    add-int/lit8 v11, v11, 0x1

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_f
    new-instance v1, Lw/M;

    .line 230
    .line 231
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Lv0/l;

    .line 236
    .line 237
    invoke-direct {v1, v2}, Lw/M;-><init>(Lv0/l;)V

    .line 238
    .line 239
    .line 240
    iput-object v1, v4, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 241
    .line 242
    :goto_a
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 243
    .line 244
    return-object v1
.end method
