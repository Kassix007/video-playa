.class public final Lb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lb2/c;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lb2/a;->a:Z

    .line 10
    iput-object p2, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 11
    iput-object p3, p0, Lb2/a;->c:Ljava/lang/Object;

    .line 12
    iput-object p4, p0, Lb2/a;->g:Ljava/lang/Object;

    .line 13
    iput-object p5, p0, Lb2/a;->f:Ljava/lang/Object;

    .line 14
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    .line 15
    sget-object p1, Lb2/d;->d:[B

    goto :goto_0

    :cond_0
    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 16
    :pswitch_0
    sget-object p1, Lb2/d;->e:[B

    goto :goto_0

    .line 17
    :pswitch_1
    sget-object p1, Lb2/d;->f:[B

    goto :goto_0

    .line 18
    :pswitch_2
    sget-object p1, Lb2/d;->g:[B

    goto :goto_0

    .line 19
    :pswitch_3
    sget-object p1, Lb2/d;->h:[B

    .line 20
    :goto_0
    iput-object p1, p0, Lb2/a;->d:Ljava/io/Serializable;

    return-void

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lw/H0;Li1/a;LX/c;LW0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lb2/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lb2/a;->d:Ljava/io/Serializable;

    .line 5
    iput-object p4, p0, Lb2/a;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const p3, 0x7fffffff

    .line 6
    invoke-static {p3, p1, p2}, Ll6/d;->e(ILO5/a;I)LO5/e;

    move-result-object p1

    iput-object p1, p0, Lb2/a;->f:Ljava/lang/Object;

    .line 7
    new-instance p1, Lv3/l;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lv3/l;-><init>(I)V

    iput-object p1, p0, Lb2/a;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lb2/a;Lw/E0;F)F
    .locals 3

    .line 1
    iget-object p0, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lw/H0;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lw/H0;->d(F)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p2}, Lw/H0;->h(F)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p1, p1, Lw/E0;->a:Lw/H0;

    .line 14
    .line 15
    iget-object p2, p1, Lw/H0;->j:Lw/i0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-static {p1, p2, v0, v1, v2}, Lw/H0;->a(Lw/H0;Lw/i0;JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-virtual {p0, p1, p2}, Lw/H0;->e(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, Lw/H0;->g(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public static final b(Lb2/a;Lw/H0;Lw/Q;FFLs5/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v2, v1, Lw/U;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    check-cast v2, Lw/U;

    .line 18
    .line 19
    iget v3, v2, Lw/U;->w:I

    .line 20
    .line 21
    const/high16 v4, -0x80000000

    .line 22
    .line 23
    and-int v6, v3, v4

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sub-int/2addr v3, v4

    .line 28
    iput v3, v2, Lw/U;->w:I

    .line 29
    .line 30
    :goto_0
    move-object v9, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v2, Lw/U;

    .line 33
    .line 34
    invoke-direct {v2, v5, v1}, Lw/U;-><init>(Lb2/a;Ls5/c;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget-object v1, v9, Lw/U;->u:Ljava/lang/Object;

    .line 39
    .line 40
    iget v2, v9, Lw/U;->w:I

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    sget-object v11, Lm5/y;->a:Lm5/y;

    .line 44
    .line 45
    const/4 v12, 0x2

    .line 46
    const/4 v13, 0x1

    .line 47
    sget-object v14, Lr5/a;->q:Lr5/a;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    if-eq v2, v13, :cond_2

    .line 52
    .line 53
    if-ne v2, v12, :cond_1

    .line 54
    .line 55
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v11

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    iget v0, v9, Lw/U;->t:F

    .line 68
    .line 69
    iget-object v2, v9, Lw/U;->s:Lkotlin/jvm/internal/v;

    .line 70
    .line 71
    iget-object v3, v9, Lw/U;->r:Lw/H0;

    .line 72
    .line 73
    iget-object v4, v9, Lw/U;->q:Lb2/a;

    .line 74
    .line 75
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_3
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lkotlin/jvm/internal/y;

    .line 84
    .line 85
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, Lb2/a;->g(Lw/Q;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v5, Lb2/a;->f:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, LO5/e;

    .line 96
    .line 97
    invoke-static {v0}, Lb2/a;->f(LO5/e;)Lw/Q;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-virtual {v5, v0}, Lb2/a;->g(Lw/Q;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lw/Q;

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lw/Q;->a(Lw/Q;)Lw/Q;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_4
    new-instance v1, Lkotlin/jvm/internal/v;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lw/Q;

    .line 124
    .line 125
    iget-wide v12, v0, Lw/Q;->a:J

    .line 126
    .line 127
    invoke-virtual {v7, v12, v13}, Lw/H0;->e(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v12

    .line 131
    invoke-virtual {v7, v12, v13}, Lw/H0;->g(J)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iput v0, v1, Lkotlin/jvm/internal/v;->q:F

    .line 136
    .line 137
    invoke-static {v0}, Lw/P;->a(F)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_5
    new-instance v2, Lkotlin/jvm/internal/y;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    const/16 v0, 0x1e

    .line 151
    .line 152
    invoke-static {v10, v10, v0}, Lu/d;->a(FFI)Lu/l;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 157
    .line 158
    new-instance v0, Lw/W;

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    move/from16 v4, p3

    .line 162
    .line 163
    move/from16 v6, p4

    .line 164
    .line 165
    invoke-direct/range {v0 .. v8}, Lw/W;-><init>(Lkotlin/jvm/internal/v;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;FLb2/a;FLw/H0;Lq5/c;)V

    .line 166
    .line 167
    .line 168
    iput-object v5, v9, Lw/U;->q:Lb2/a;

    .line 169
    .line 170
    iput-object v7, v9, Lw/U;->r:Lw/H0;

    .line 171
    .line 172
    iput-object v1, v9, Lw/U;->s:Lkotlin/jvm/internal/v;

    .line 173
    .line 174
    iput v6, v9, Lw/U;->t:F

    .line 175
    .line 176
    const/4 v15, 0x1

    .line 177
    iput v15, v9, Lw/U;->w:I

    .line 178
    .line 179
    invoke-virtual {v5, v7, v0, v9}, Lb2/a;->h(Lw/H0;Lw/W;Ls5/c;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-ne v0, v14, :cond_6

    .line 184
    .line 185
    goto/16 :goto_5

    .line 186
    .line 187
    :cond_6
    move-object v2, v1

    .line 188
    move-object v4, v5

    .line 189
    move v0, v6

    .line 190
    move-object v3, v7

    .line 191
    :goto_2
    iget-object v1, v4, Lb2/a;->h:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, Lv3/l;

    .line 194
    .line 195
    iget-object v5, v1, Lv3/l;->r:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v5, Lw0/c;

    .line 198
    .line 199
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v6}, Lw0/c;->b(F)F

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iget-object v1, v1, Lv3/l;->s:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Lw0/c;

    .line 209
    .line 210
    invoke-virtual {v1, v6}, Lw0/c;->b(F)F

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-static {v5, v1}, Ll6/d;->i(FF)J

    .line 215
    .line 216
    .line 217
    move-result-wide v5

    .line 218
    const-wide/16 v7, 0x0

    .line 219
    .line 220
    cmp-long v1, v5, v7

    .line 221
    .line 222
    if-nez v1, :cond_9

    .line 223
    .line 224
    iget v1, v2, Lkotlin/jvm/internal/v;->q:F

    .line 225
    .line 226
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    const/16 v5, 0x64

    .line 231
    .line 232
    int-to-float v5, v5

    .line 233
    div-float/2addr v1, v5

    .line 234
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iget v1, v2, Lkotlin/jvm/internal/v;->q:F

    .line 239
    .line 240
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v3, v1}, Lw/H0;->d(F)F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    mul-float/2addr v1, v0

    .line 249
    const/16 v0, 0x3e8

    .line 250
    .line 251
    int-to-float v0, v0

    .line 252
    mul-float/2addr v1, v0

    .line 253
    cmpg-float v0, v1, v10

    .line 254
    .line 255
    if-nez v0, :cond_7

    .line 256
    .line 257
    move-wide v5, v7

    .line 258
    goto :goto_4

    .line 259
    :cond_7
    iget-object v0, v3, Lw/H0;->d:Lw/d0;

    .line 260
    .line 261
    sget-object v2, Lw/d0;->r:Lw/d0;

    .line 262
    .line 263
    if-ne v0, v2, :cond_8

    .line 264
    .line 265
    invoke-static {v1, v10}, Ll6/d;->i(FF)J

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    :goto_3
    move-wide v5, v0

    .line 270
    goto :goto_4

    .line 271
    :cond_8
    invoke-static {v10, v1}, Ll6/d;->i(FF)J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    goto :goto_3

    .line 276
    :cond_9
    :goto_4
    iget-object v0, v4, Lb2/a;->d:Ljava/io/Serializable;

    .line 277
    .line 278
    check-cast v0, LX/c;

    .line 279
    .line 280
    const/4 v1, 0x0

    .line 281
    iput-object v1, v9, Lw/U;->q:Lb2/a;

    .line 282
    .line 283
    iput-object v1, v9, Lw/U;->r:Lw/H0;

    .line 284
    .line 285
    iput-object v1, v9, Lw/U;->s:Lkotlin/jvm/internal/v;

    .line 286
    .line 287
    const/4 v2, 0x2

    .line 288
    iput v2, v9, Lw/U;->w:I

    .line 289
    .line 290
    iget-object v0, v0, Lkotlin/jvm/internal/a;->q:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lw/z0;

    .line 293
    .line 294
    iget-object v2, v0, Lw/z0;->Q:Lu0/d;

    .line 295
    .line 296
    invoke-virtual {v2}, Lu0/d;->c()LM5/w;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    new-instance v3, Lw/w0;

    .line 301
    .line 302
    invoke-direct {v3, v0, v5, v6, v1}, Lw/w0;-><init>(Lw/z0;JLq5/c;)V

    .line 303
    .line 304
    .line 305
    const/4 v0, 0x3

    .line 306
    invoke-static {v2, v1, v1, v3, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 307
    .line 308
    .line 309
    if-ne v11, v14, :cond_a

    .line 310
    .line 311
    :goto_5
    return-object v14

    .line 312
    :cond_a
    :goto_6
    return-object v11
.end method

.method public static final c(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/y;JLs5/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    instance-of v3, v2, Lw/X;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lw/X;

    .line 11
    .line 12
    iget v4, v3, Lw/X;->w:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lw/X;->w:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lw/X;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Ls5/c;-><init>(Lq5/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lw/X;->v:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Lw/X;->w:I

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    iget-object p0, v3, Lw/X;->u:Lkotlin/jvm/internal/y;

    .line 39
    .line 40
    iget-object p1, v3, Lw/X;->t:Lw/H0;

    .line 41
    .line 42
    iget-object v0, v3, Lw/X;->s:Lkotlin/jvm/internal/v;

    .line 43
    .line 44
    iget-object v1, v3, Lw/X;->r:Lkotlin/jvm/internal/y;

    .line 45
    .line 46
    iget-object v3, v3, Lw/X;->q:Lb2/a;

    .line 47
    .line 48
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v7, p0

    .line 52
    move-object v6, p1

    .line 53
    move-object p1, v1

    .line 54
    move-object p0, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_2
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v6, 0x0

    .line 68
    .line 69
    cmp-long v2, v0, v6

    .line 70
    .line 71
    if-gez v2, :cond_3

    .line 72
    .line 73
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    new-instance v2, Lw/Y;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v2, p0, v4}, Lw/Y;-><init>(Lb2/a;Lq5/c;)V

    .line 80
    .line 81
    .line 82
    iput-object p0, v3, Lw/X;->q:Lb2/a;

    .line 83
    .line 84
    iput-object p1, v3, Lw/X;->r:Lkotlin/jvm/internal/y;

    .line 85
    .line 86
    iput-object p2, v3, Lw/X;->s:Lkotlin/jvm/internal/v;

    .line 87
    .line 88
    iput-object p3, v3, Lw/X;->t:Lw/H0;

    .line 89
    .line 90
    iput-object p4, v3, Lw/X;->u:Lkotlin/jvm/internal/y;

    .line 91
    .line 92
    iput v5, v3, Lw/X;->w:I

    .line 93
    .line 94
    invoke-static {v0, v1, v2, v3}, LM5/y;->C(JLB5/e;Ls5/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 99
    .line 100
    if-ne v2, v0, :cond_4

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_4
    move-object v0, p2

    .line 104
    move-object v6, p3

    .line 105
    move-object v7, p4

    .line 106
    :goto_1
    check-cast v2, Lw/Q;

    .line 107
    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    iget-object v1, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lw/Q;

    .line 113
    .line 114
    iget-boolean v1, v1, Lw/Q;->c:Z

    .line 115
    .line 116
    iget-wide v3, v2, Lw/Q;->a:J

    .line 117
    .line 118
    iget-wide v8, v2, Lw/Q;->b:J

    .line 119
    .line 120
    new-instance v10, Lw/Q;

    .line 121
    .line 122
    move/from16 p7, v1

    .line 123
    .line 124
    move-wide p3, v3

    .line 125
    move-wide/from16 p5, v8

    .line 126
    .line 127
    move-object p2, v10

    .line 128
    invoke-direct/range {p2 .. p7}, Lw/Q;-><init>(JJZ)V

    .line 129
    .line 130
    .line 131
    move-object v1, p2

    .line 132
    iput-object v1, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v6, v3, v4}, Lw/H0;->e(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {v6, v3, v4}, Lw/H0;->g(J)F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iput p1, v0, Lkotlin/jvm/internal/v;->q:F

    .line 143
    .line 144
    const/16 p1, 0x1e

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-static {v1, v1, p1}, Lu/d;->a(FFI)Lu/l;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Lb2/a;->g(Lw/Q;)V

    .line 154
    .line 155
    .line 156
    iget p0, v0, Lkotlin/jvm/internal/v;->q:F

    .line 157
    .line 158
    invoke-static {p0}, Lw/P;->a(F)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    xor-int/2addr p0, v5

    .line 163
    goto :goto_2

    .line 164
    :cond_5
    const/4 p0, 0x0

    .line 165
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0
.end method

.method public static f(LO5/e;)Lw/Q;
    .locals 2

    .line 1
    new-instance v0, Lv/F;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, Lv/F;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lw/a0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Lw/a0;-><init>(Lv/F;Lq5/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/K1;->w(LB5/e;)LI5/j;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, LI5/j;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, LI5/j;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lw/Q;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Lw/Q;->a(Lw/Q;)Lw/Q;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public d(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p2, "compressed"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lb2/a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lb2/c;

    .line 28
    .line 29
    invoke-interface {p1}, Lb2/c;->j()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public e(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lb/i;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, p1, v2, p0, p2}, Lb/i;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(Lw/Q;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb2/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/l;

    .line 4
    .line 5
    iget-wide v1, p1, Lw/Q;->b:J

    .line 6
    .line 7
    iget-wide v3, p1, Lw/Q;->a:J

    .line 8
    .line 9
    iget-object p1, v0, Lv3/l;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lw0/c;

    .line 12
    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    shr-long v5, v3, v5

    .line 16
    .line 17
    long-to-int v5, v5

    .line 18
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {p1, v1, v2, v5}, Lw0/c;->a(JF)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Lv3/l;->s:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lw0/c;

    .line 28
    .line 29
    const-wide v5, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v3, v5

    .line 35
    long-to-int v0, v3

    .line 36
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v1, v2, v0}, Lw0/c;->a(JF)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public h(Lw/H0;Lw/W;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lw/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lw/b0;

    .line 7
    .line 8
    iget v1, v0, Lw/b0;->t:I

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
    iput v1, v0, Lw/b0;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/b0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lw/b0;-><init>(Lb2/a;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lw/b0;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/b0;->t:I

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
    iget-object p1, v0, Lw/b0;->q:Lb2/a;

    .line 35
    .line 36
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-boolean v2, p0, Lb2/a;->a:Z

    .line 52
    .line 53
    new-instance p3, Lw/c0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {p3, p1, p2, v1}, Lw/c0;-><init>(Lw/H0;LB5/e;Lq5/c;)V

    .line 57
    .line 58
    .line 59
    iput-object p0, v0, Lw/b0;->q:Lb2/a;

    .line 60
    .line 61
    iput v2, v0, Lw/b0;->t:I

    .line 62
    .line 63
    new-instance p1, LM5/p0;

    .line 64
    .line 65
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {p1, p2, v0, v1}, LM5/p0;-><init>(Lq5/h;Lq5/c;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2, p1, p3}, Lcom/google/android/gms/internal/measurement/I1;->D0(LR5/r;ZLR5/r;LB5/e;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 78
    .line 79
    if-ne p1, p2, :cond_3

    .line 80
    .line 81
    return-object p2

    .line 82
    :cond_3
    move-object p1, p0

    .line 83
    :goto_1
    const/4 p2, 0x0

    .line 84
    iput-boolean p2, p1, Lb2/a;->a:Z

    .line 85
    .line 86
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 87
    .line 88
    return-object p1
.end method
