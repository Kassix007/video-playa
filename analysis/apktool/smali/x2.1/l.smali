.class public final Lx2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/g;


# static fields
.field public static final f:Ld6/c;

.field public static final g:Ld6/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LD2/n;

.field public final c:Lm5/o;

.field public final d:Lm5/o;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ld6/c;

    .line 2
    .line 3
    const/4 v12, 0x0

    .line 4
    const/4 v13, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, -0x1

    .line 13
    const/4 v9, -0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    invoke-direct/range {v0 .. v13}, Ld6/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lx2/l;->f:Ld6/c;

    .line 20
    .line 21
    new-instance v1, Ld6/c;

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v5, -0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v10, -0x1

    .line 29
    const/4 v11, 0x1

    .line 30
    invoke-direct/range {v1 .. v14}, Ld6/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lx2/l;->g:Ld6/c;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LD2/n;Lm5/o;Lm5/o;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lx2/l;->b:LD2/n;

    .line 7
    .line 8
    iput-object p3, p0, Lx2/l;->c:Lm5/o;

    .line 9
    .line 10
    iput-object p4, p0, Lx2/l;->d:Lm5/o;

    .line 11
    .line 12
    iput-boolean p5, p0, Lx2/l;->e:Z

    .line 13
    .line 14
    return-void
.end method

.method public static d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p1, Ld6/p;->a:Ljava/lang/String;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object p1, v0

    .line 8
    :goto_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const-string v1, "text/plain"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p1, v1, v2}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, p0}, LH2/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    if-eqz p1, :cond_3

    .line 31
    .line 32
    const/16 p0, 0x3b

    .line 33
    .line 34
    invoke-static {p1, p0}, LJ5/m;->j1(Ljava/lang/String;C)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, Lx2/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lx2/k;

    .line 7
    .line 8
    iget v1, v0, Lx2/k;->v:I

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
    iput v1, v0, Lx2/k;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx2/k;

    .line 21
    .line 22
    check-cast p1, Ls5/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lx2/k;-><init>(Lx2/l;Ls5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Lx2/k;->t:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lx2/k;->v:I

    .line 30
    .line 31
    const-string v2, "response body == null"

    .line 32
    .line 33
    sget-object v3, Lv2/e;->t:Lv2/e;

    .line 34
    .line 35
    sget-object v4, Lv2/e;->s:Lv2/e;

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    sget-object v8, Lr5/a;->q:Lr5/a;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    if-eq v1, v6, :cond_2

    .line 45
    .line 46
    if-ne v1, v5, :cond_1

    .line 47
    .line 48
    iget-object v1, v0, Lx2/k;->s:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ld6/u;

    .line 51
    .line 52
    iget-object v5, v0, Lx2/k;->r:Lk3/a;

    .line 53
    .line 54
    iget-object v0, v0, Lx2/k;->q:Lx2/l;

    .line 55
    .line 56
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_9

    .line 60
    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    iget-object v1, v0, Lx2/k;->s:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, LC2/d;

    .line 75
    .line 76
    iget-object v6, v0, Lx2/k;->r:Lk3/a;

    .line 77
    .line 78
    iget-object v9, v0, Lx2/k;->q:Lx2/l;

    .line 79
    .line 80
    :try_start_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :catch_1
    move-exception p1

    .line 86
    goto/16 :goto_c

    .line 87
    .line 88
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lx2/l;->b:LD2/n;

    .line 92
    .line 93
    iget-object v1, p1, LD2/n;->n:LD2/b;

    .line 94
    .line 95
    iget-boolean v1, v1, LD2/b;->q:Z

    .line 96
    .line 97
    iget-object v9, p0, Lx2/l;->a:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-object v1, p0, Lx2/l;->d:Lm5/o;

    .line 102
    .line 103
    invoke-virtual {v1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Lw2/g;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    iget-object p1, p1, LD2/n;->i:Ljava/lang/String;

    .line 112
    .line 113
    if-nez p1, :cond_4

    .line 114
    .line 115
    move-object p1, v9

    .line 116
    :cond_4
    iget-object v1, v1, Lw2/g;->b:Lw2/e;

    .line 117
    .line 118
    sget-object v10, Lq6/j;->t:Lq6/j;

    .line 119
    .line 120
    invoke-static {p1}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string v10, "SHA-256"

    .line 125
    .line 126
    invoke-virtual {p1, v10}, Lq6/j;->b(Ljava/lang/String;)Lq6/j;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lq6/j;->d()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v1, p1}, Lw2/e;->c(Ljava/lang/String;)Lw2/b;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    new-instance v1, Lk3/a;

    .line 141
    .line 142
    invoke-direct {v1, v6, p1}, Lk3/a;-><init>(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    move-object v1, v7

    .line 147
    :goto_1
    if-eqz v1, :cond_b

    .line 148
    .line 149
    :try_start_2
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object v10, v1, Lk3/a;->r:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v10, Lw2/b;

    .line 156
    .line 157
    iget-boolean v11, v10, Lw2/b;->r:Z

    .line 158
    .line 159
    if-nez v11, :cond_a

    .line 160
    .line 161
    iget-object v10, v10, Lw2/b;->q:Lw2/a;

    .line 162
    .line 163
    iget-object v10, v10, Lw2/a;->c:Ljava/util/ArrayList;

    .line 164
    .line 165
    const/4 v11, 0x0

    .line 166
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    check-cast v10, Lq6/x;

    .line 171
    .line 172
    invoke-virtual {p1, v10}, Lq6/l;->G(Lq6/x;)Le1/e;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget-object p1, p1, Le1/e;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p1, Ljava/lang/Long;

    .line 179
    .line 180
    if-nez p1, :cond_6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v10

    .line 187
    const-wide/16 v12, 0x0

    .line 188
    .line 189
    cmp-long p1, v10, v12

    .line 190
    .line 191
    if-nez p1, :cond_7

    .line 192
    .line 193
    new-instance p1, Lx2/m;

    .line 194
    .line 195
    invoke-virtual {p0, v1}, Lx2/l;->g(Lk3/a;)Lv2/k;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v9, v7}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {p1, v0, v2, v4}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 204
    .line 205
    .line 206
    return-object p1

    .line 207
    :catch_2
    move-exception p1

    .line 208
    move-object v6, v1

    .line 209
    goto/16 :goto_c

    .line 210
    .line 211
    :cond_7
    :goto_2
    iget-boolean p1, p0, Lx2/l;->e:Z

    .line 212
    .line 213
    if-eqz p1, :cond_8

    .line 214
    .line 215
    new-instance p1, LC2/c;

    .line 216
    .line 217
    invoke-virtual {p0}, Lx2/l;->e()Ld6/s;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-virtual {p0, v1}, Lx2/l;->f(Lk3/a;)LC2/b;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    invoke-direct {p1, v10, v11}, LC2/c;-><init>(Ld6/s;LC2/b;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, LC2/c;->a()LC2/d;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iget-object v10, p1, LC2/d;->b:LC2/b;

    .line 233
    .line 234
    iget-object v11, p1, LC2/d;->a:Ld6/s;

    .line 235
    .line 236
    if-nez v11, :cond_c

    .line 237
    .line 238
    if-eqz v10, :cond_c

    .line 239
    .line 240
    new-instance p1, Lx2/m;

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Lx2/l;->g(Lk3/a;)Lv2/k;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iget-object v2, v10, LC2/b;->b:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ld6/p;

    .line 253
    .line 254
    invoke-static {v9, v2}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-direct {p1, v0, v2, v4}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :cond_8
    new-instance p1, Lx2/m;

    .line 263
    .line 264
    invoke-virtual {p0, v1}, Lx2/l;->g(Lk3/a;)Lv2/k;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p0, v1}, Lx2/l;->f(Lk3/a;)LC2/b;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    if-eqz v2, :cond_9

    .line 273
    .line 274
    iget-object v2, v2, LC2/b;->b:Ljava/lang/Object;

    .line 275
    .line 276
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    move-object v7, v2

    .line 281
    check-cast v7, Ld6/p;

    .line 282
    .line 283
    :cond_9
    invoke-static {v9, v7}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-direct {p1, v0, v2, v4}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 288
    .line 289
    .line 290
    return-object p1

    .line 291
    :cond_a
    const-string p1, "snapshot is closed"

    .line 292
    .line 293
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_b
    new-instance p1, LC2/c;

    .line 300
    .line 301
    invoke-virtual {p0}, Lx2/l;->e()Ld6/s;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-direct {p1, v9, v7}, LC2/c;-><init>(Ld6/s;LC2/b;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, LC2/c;->a()LC2/d;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    :cond_c
    iget-object v9, p1, LC2/d;->a:Ld6/s;

    .line 313
    .line 314
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iput-object p0, v0, Lx2/k;->q:Lx2/l;

    .line 318
    .line 319
    iput-object v1, v0, Lx2/k;->r:Lk3/a;

    .line 320
    .line 321
    iput-object p1, v0, Lx2/k;->s:Ljava/lang/Object;

    .line 322
    .line 323
    iput v6, v0, Lx2/k;->v:I

    .line 324
    .line 325
    invoke-virtual {p0, v9, v0}, Lx2/l;->b(Ld6/s;Ls5/c;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 329
    if-ne v6, v8, :cond_d

    .line 330
    .line 331
    goto/16 :goto_8

    .line 332
    .line 333
    :cond_d
    move-object v9, v1

    .line 334
    move-object v1, p1

    .line 335
    move-object p1, v6

    .line 336
    move-object v6, v9

    .line 337
    move-object v9, p0

    .line 338
    :goto_3
    :try_start_3
    check-cast p1, Ld6/u;

    .line 339
    .line 340
    sget-object v10, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 341
    .line 342
    iget-object v10, p1, Ld6/u;->w:Ld6/w;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 343
    .line 344
    if-eqz v10, :cond_15

    .line 345
    .line 346
    :try_start_4
    iget-object v11, v1, LC2/d;->a:Ld6/s;

    .line 347
    .line 348
    iget-object v1, v1, LC2/d;->b:LC2/b;

    .line 349
    .line 350
    invoke-virtual {v9, v6, v11, p1, v1}, Lx2/l;->h(Lk3/a;Ld6/s;Ld6/u;LC2/b;)Lk3/a;

    .line 351
    .line 352
    .line 353
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 354
    iget-object v6, v9, Lx2/l;->a:Ljava/lang/String;

    .line 355
    .line 356
    if-eqz v1, :cond_f

    .line 357
    .line 358
    :try_start_5
    new-instance v0, Lx2/m;

    .line 359
    .line 360
    invoke-virtual {v9, v1}, Lx2/l;->g(Lk3/a;)Lv2/k;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v9, v1}, Lx2/l;->f(Lk3/a;)LC2/b;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    if-eqz v4, :cond_e

    .line 369
    .line 370
    iget-object v4, v4, LC2/b;->b:Ljava/lang/Object;

    .line 371
    .line 372
    invoke-interface {v4}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    move-object v7, v4

    .line 377
    check-cast v7, Ld6/p;

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :goto_4
    move-object v5, v1

    .line 381
    :goto_5
    move-object v1, p1

    .line 382
    move-object p1, v0

    .line 383
    goto/16 :goto_b

    .line 384
    .line 385
    :cond_e
    :goto_6
    invoke-static {v6, v7}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-direct {v0, v2, v4, v3}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :catch_3
    move-exception v0

    .line 394
    goto :goto_4

    .line 395
    :cond_f
    invoke-virtual {v10}, Ld6/w;->O()Lq6/i;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    const-wide/16 v12, 0x1

    .line 400
    .line 401
    invoke-interface {v11, v12, v13}, Lq6/i;->o(J)Z

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    if-eqz v11, :cond_11

    .line 406
    .line 407
    new-instance v0, Lx2/m;

    .line 408
    .line 409
    invoke-virtual {v10}, Ld6/w;->O()Lq6/i;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    iget-object v5, v9, Lx2/l;->b:LD2/n;

    .line 414
    .line 415
    iget-object v5, v5, LD2/n;->a:Landroid/content/Context;

    .line 416
    .line 417
    new-instance v5, Lv2/m;

    .line 418
    .line 419
    invoke-direct {v5, v2, v7}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v10}, Ld6/w;->b()Ld6/p;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-static {v6, v2}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    iget-object v6, p1, Ld6/u;->x:Ld6/u;

    .line 431
    .line 432
    if-eqz v6, :cond_10

    .line 433
    .line 434
    goto :goto_7

    .line 435
    :cond_10
    move-object v3, v4

    .line 436
    :goto_7
    invoke-direct {v0, v5, v2, v3}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 437
    .line 438
    .line 439
    return-object v0

    .line 440
    :cond_11
    invoke-static {p1}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v9}, Lx2/l;->e()Ld6/s;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    iput-object v9, v0, Lx2/k;->q:Lx2/l;

    .line 448
    .line 449
    iput-object v1, v0, Lx2/k;->r:Lk3/a;

    .line 450
    .line 451
    iput-object p1, v0, Lx2/k;->s:Ljava/lang/Object;

    .line 452
    .line 453
    iput v5, v0, Lx2/k;->v:I

    .line 454
    .line 455
    invoke-virtual {v9, v6, v0}, Lx2/l;->b(Ld6/s;Ls5/c;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 459
    if-ne v0, v8, :cond_12

    .line 460
    .line 461
    :goto_8
    return-object v8

    .line 462
    :cond_12
    move-object v5, v1

    .line 463
    move-object v1, p1

    .line 464
    move-object p1, v0

    .line 465
    move-object v0, v9

    .line 466
    :goto_9
    :try_start_6
    check-cast p1, Ld6/u;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 467
    .line 468
    :try_start_7
    sget-object v1, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 469
    .line 470
    iget-object v1, p1, Ld6/u;->w:Ld6/w;

    .line 471
    .line 472
    if-eqz v1, :cond_14

    .line 473
    .line 474
    new-instance v2, Lx2/m;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1}, Ld6/w;->O()Lq6/i;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    iget-object v8, v0, Lx2/l;->b:LD2/n;

    .line 484
    .line 485
    iget-object v8, v8, LD2/n;->a:Landroid/content/Context;

    .line 486
    .line 487
    new-instance v8, Lv2/m;

    .line 488
    .line 489
    invoke-direct {v8, v6, v7}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 490
    .line 491
    .line 492
    iget-object v0, v0, Lx2/l;->a:Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v1}, Ld6/w;->b()Ld6/p;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-static {v0, v1}, Lx2/l;->d(Ljava/lang/String;Ld6/p;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    iget-object v1, p1, Ld6/u;->x:Ld6/u;

    .line 503
    .line 504
    if-eqz v1, :cond_13

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_13
    move-object v3, v4

    .line 508
    :goto_a
    invoke-direct {v2, v8, v0, v3}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 509
    .line 510
    .line 511
    return-object v2

    .line 512
    :catch_4
    move-exception v0

    .line 513
    goto/16 :goto_5

    .line 514
    .line 515
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 516
    .line 517
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 521
    :catch_5
    move-exception v0

    .line 522
    move-object v1, p1

    .line 523
    move-object p1, v0

    .line 524
    move-object v5, v6

    .line 525
    :goto_b
    :try_start_8
    invoke-static {v1}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 526
    .line 527
    .line 528
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 529
    :catch_6
    move-exception p1

    .line 530
    move-object v6, v5

    .line 531
    goto :goto_c

    .line 532
    :cond_15
    :try_start_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 533
    .line 534
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw p1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    .line 538
    :goto_c
    if-eqz v6, :cond_16

    .line 539
    .line 540
    invoke-static {v6}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 541
    .line 542
    .line 543
    :cond_16
    throw p1
.end method

.method public final b(Ld6/s;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lx2/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lx2/j;

    .line 7
    .line 8
    iget v1, v0, Lx2/j;->s:I

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
    iput v1, v0, Lx2/j;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx2/j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lx2/j;-><init>(Lx2/l;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lx2/j;->q:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 28
    .line 29
    iget v2, v0, Lx2/j;->s:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p2, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 53
    .line 54
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {p2, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    iget-object p2, p0, Lx2/l;->b:LD2/n;

    .line 70
    .line 71
    iget-object p2, p2, LD2/n;->o:LD2/b;

    .line 72
    .line 73
    iget-boolean p2, p2, LD2/b;->q:Z

    .line 74
    .line 75
    if-nez p2, :cond_4

    .line 76
    .line 77
    iget-object p2, p0, Lx2/l;->c:Lm5/o;

    .line 78
    .line 79
    invoke-virtual {p2}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Ld6/d;

    .line 84
    .line 85
    check-cast p2, Ld6/q;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v0, "request"

    .line 91
    .line 92
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lh6/h;

    .line 96
    .line 97
    invoke-direct {v0, p2, p1}, Lh6/h;-><init>(Ld6/q;Ld6/s;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, v0, Lh6/h;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    .line 102
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    iget-object p1, v0, Lh6/h;->t:Lh6/g;

    .line 109
    .line 110
    invoke-virtual {p1}, Lq6/d;->h()V

    .line 111
    .line 112
    .line 113
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 114
    .line 115
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 116
    .line 117
    invoke-virtual {p1}, Ll6/m;->g()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, v0, Lh6/h;->v:Ljava/lang/Object;

    .line 122
    .line 123
    :try_start_0
    iget-object p1, p2, Ld6/q;->q:LE/c0;

    .line 124
    .line 125
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :try_start_1
    iget-object v1, p1, LE/c0;->t:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/util/ArrayDeque;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    .line 132
    .line 133
    :try_start_2
    monitor-exit p1

    .line 134
    invoke-virtual {v0}, Lh6/h;->g()Ld6/u;

    .line 135
    .line 136
    .line 137
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    iget-object p2, p2, Ld6/q;->q:LE/c0;

    .line 139
    .line 140
    iget-object v1, p2, LE/c0;->t:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/ArrayDeque;

    .line 143
    .line 144
    invoke-virtual {p2, v1, v0}, LE/c0;->i(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    goto :goto_1

    .line 150
    :catchall_1
    move-exception p2

    .line 151
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 153
    :goto_1
    iget-object p2, v0, Lh6/h;->q:Ld6/q;

    .line 154
    .line 155
    iget-object p2, p2, Ld6/q;->q:LE/c0;

    .line 156
    .line 157
    iget-object v1, p2, LE/c0;->t:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/util/ArrayDeque;

    .line 160
    .line 161
    invoke-virtual {p2, v1, v0}, LE/c0;->i(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_3
    const-string p1, "Already Executed"

    .line 166
    .line 167
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p2

    .line 173
    :cond_4
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    .line 174
    .line 175
    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_5
    iget-object p2, p0, Lx2/l;->c:Lm5/o;

    .line 180
    .line 181
    invoke-virtual {p2}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    check-cast p2, Ld6/d;

    .line 186
    .line 187
    check-cast p2, Ld6/q;

    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    const-string v4, "request"

    .line 193
    .line 194
    invoke-static {p1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v4, Lh6/h;

    .line 198
    .line 199
    invoke-direct {v4, p2, p1}, Lh6/h;-><init>(Ld6/q;Ld6/s;)V

    .line 200
    .line 201
    .line 202
    iput v3, v0, Lx2/j;->s:I

    .line 203
    .line 204
    new-instance p1, LM5/h;

    .line 205
    .line 206
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-direct {p1, v3, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, LM5/h;->s()V

    .line 214
    .line 215
    .line 216
    new-instance p2, LH2/g;

    .line 217
    .line 218
    invoke-direct {p2, v4, p1, v2}, LH2/g;-><init>(Lh6/h;LM5/h;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, p2}, Lh6/h;->e(LH2/g;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2}, LM5/h;->u(LB5/c;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, LM5/h;->r()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    if-ne p2, v1, :cond_6

    .line 232
    .line 233
    return-object v1

    .line 234
    :cond_6
    :goto_2
    move-object p1, p2

    .line 235
    check-cast p1, Ld6/u;

    .line 236
    .line 237
    :goto_3
    iget p2, p1, Ld6/u;->t:I

    .line 238
    .line 239
    const/16 v0, 0xc8

    .line 240
    .line 241
    if-gt v0, p2, :cond_7

    .line 242
    .line 243
    const/16 v0, 0x12c

    .line 244
    .line 245
    if-ge p2, v0, :cond_7

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_7
    const/16 v0, 0x130

    .line 249
    .line 250
    if-eq p2, v0, :cond_9

    .line 251
    .line 252
    iget-object p2, p1, Ld6/u;->w:Ld6/w;

    .line 253
    .line 254
    if-eqz p2, :cond_8

    .line 255
    .line 256
    invoke-static {p2}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    new-instance p2, LC2/e;

    .line 260
    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    const-string v1, "HTTP "

    .line 264
    .line 265
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget v1, p1, Ld6/u;->t:I

    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v1, ": "

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    iget-object p1, p1, Ld6/u;->s:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw p2

    .line 291
    :cond_9
    :goto_4
    return-object p1
.end method

.method public final c()Lq6/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/l;->d:Lm5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lw2/g;

    .line 11
    .line 12
    iget-object v0, v0, Lw2/g;->a:Lq6/l;

    .line 13
    .line 14
    return-object v0
.end method

.method public final e()Ld6/s;
    .locals 6

    .line 1
    new-instance v0, LL0/l;

    .line 2
    .line 3
    invoke-direct {v0}, LL0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lx2/l;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LL0/l;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lx2/l;->b:LD2/n;

    .line 12
    .line 13
    iget-object v2, v1, LD2/n;->j:Ld6/l;

    .line 14
    .line 15
    const-string v3, "headers"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ld6/l;->h()Lc3/c;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v0, LL0/l;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v2, v1, LD2/n;->k:LD2/s;

    .line 27
    .line 28
    iget-object v2, v2, LD2/s;->a:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    check-cast v4, Ljava/lang/Class;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    iget-object v3, v0, LL0/l;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object v5, v0, LL0/l;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_1

    .line 84
    .line 85
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v5, v0, LL0/l;->a:Ljava/lang/Object;

    .line 91
    .line 92
    :cond_1
    iget-object v5, v0, LL0/l;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    iget-object v2, v1, LD2/n;->n:LD2/b;

    .line 108
    .line 109
    iget-boolean v3, v2, LD2/b;->q:Z

    .line 110
    .line 111
    iget-object v1, v1, LD2/n;->o:LD2/b;

    .line 112
    .line 113
    iget-boolean v1, v1, LD2/b;->q:Z

    .line 114
    .line 115
    if-nez v1, :cond_3

    .line 116
    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    sget-object v1, Ld6/c;->o:Ld6/c;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, LL0/l;->d(Ld6/c;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    if-eqz v1, :cond_5

    .line 126
    .line 127
    if-nez v3, :cond_5

    .line 128
    .line 129
    iget-boolean v1, v2, LD2/b;->r:Z

    .line 130
    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    sget-object v1, Ld6/c;->n:Ld6/c;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, LL0/l;->d(Ld6/c;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    sget-object v1, Lx2/l;->f:Ld6/c;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, LL0/l;->d(Ld6/c;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    if-nez v1, :cond_6

    .line 146
    .line 147
    if-nez v3, :cond_6

    .line 148
    .line 149
    sget-object v1, Lx2/l;->g:Ld6/c;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, LL0/l;->d(Ld6/c;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_1
    invoke-virtual {v0}, LL0/l;->c()Ld6/s;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0
.end method

.method public final f(Lk3/a;)LC2/b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object p1, p1, Lk3/a;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lw2/b;

    .line 9
    .line 10
    iget-boolean v2, p1, Lw2/b;->r:Z

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Lw2/b;->q:Lw2/a;

    .line 15
    .line 16
    iget-object p1, p1, Lw2/a;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lq6/x;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lq6/l;->a0(Lq6/x;)Lq6/G;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :try_start_1
    new-instance v1, LC2/b;

    .line 34
    .line 35
    invoke-direct {v1, p1}, LC2/b;-><init>(Lq6/A;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_2
    invoke-virtual {p1}, Lq6/A;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object p1, v0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception v1

    .line 46
    :try_start_3
    invoke-virtual {p1}, Lq6/A;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_2
    move-exception p1

    .line 51
    :try_start_4
    invoke-static {v1, p1}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    move-object p1, v1

    .line 55
    move-object v1, v0

    .line 56
    :goto_1
    if-nez p1, :cond_0

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_0
    throw p1

    .line 60
    :cond_1
    const-string p1, "snapshot is closed"

    .line 61
    .line 62
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 68
    :catch_0
    return-object v0
.end method

.method public final g(Lk3/a;)Lv2/k;
    .locals 4

    .line 1
    iget-object v0, p1, Lk3/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw2/b;

    .line 4
    .line 5
    iget-boolean v1, v0, Lw2/b;->r:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Lw2/b;->q:Lw2/a;

    .line 10
    .line 11
    iget-object v0, v0, Lw2/a;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lq6/x;

    .line 19
    .line 20
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lx2/l;->b:LD2/n;

    .line 25
    .line 26
    iget-object v2, v2, LD2/n;->i:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, Lx2/l;->a:Ljava/lang/String;

    .line 31
    .line 32
    :cond_0
    new-instance v3, Lv2/k;

    .line 33
    .line 34
    invoke-direct {v3, v0, v1, v2, p1}, Lv2/k;-><init>(Lq6/x;Lq6/l;Ljava/lang/String;Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "snapshot is closed"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final h(Lk3/a;Ld6/s;Ld6/u;LC2/b;)Lk3/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/l;->b:LD2/n;

    .line 2
    .line 3
    iget-object v0, v0, LD2/n;->n:LD2/b;

    .line 4
    .line 5
    iget-boolean v0, v0, LD2/b;->r:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    iget-boolean v0, p0, Lx2/l;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Ld6/s;->a()Ld6/c;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-boolean p2, p2, Ld6/c;->b:Z

    .line 19
    .line 20
    if-nez p2, :cond_a

    .line 21
    .line 22
    iget-object p2, p3, Ld6/u;->D:Ld6/c;

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    sget-object p2, Ld6/c;->n:Ld6/c;

    .line 27
    .line 28
    iget-object p2, p3, Ld6/u;->v:Ld6/l;

    .line 29
    .line 30
    invoke-static {p2}, LQ2/g;->J(Ld6/l;)Ld6/c;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p3, Ld6/u;->D:Ld6/c;

    .line 35
    .line 36
    :cond_0
    iget-boolean p2, p2, Ld6/c;->b:Z

    .line 37
    .line 38
    if-nez p2, :cond_a

    .line 39
    .line 40
    iget-object p2, p3, Ld6/u;->v:Ld6/l;

    .line 41
    .line 42
    const-string v0, "Vary"

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "*"

    .line 49
    .line 50
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_a

    .line 55
    .line 56
    :cond_1
    const/16 p2, 0x10

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p1, Lk3/a;->r:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lw2/b;

    .line 63
    .line 64
    iget-object v0, p1, Lw2/b;->s:Lw2/e;

    .line 65
    .line 66
    monitor-enter v0

    .line 67
    :try_start_0
    invoke-virtual {p1}, Lw2/b;->close()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p1, Lw2/b;->q:Lw2/a;

    .line 71
    .line 72
    iget-object p1, p1, Lw2/a;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lw2/e;->b(Ljava/lang/String;)LK2/a;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    monitor-exit v0

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    new-instance v0, Li3/a;

    .line 82
    .line 83
    invoke-direct {v0, p2, p1}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    monitor-exit v0

    .line 89
    throw p1

    .line 90
    :cond_2
    iget-object p1, p0, Lx2/l;->d:Lm5/o;

    .line 91
    .line 92
    invoke-virtual {p1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lw2/g;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    iget-object v0, p0, Lx2/l;->b:LD2/n;

    .line 101
    .line 102
    iget-object v0, v0, LD2/n;->i:Ljava/lang/String;

    .line 103
    .line 104
    if-nez v0, :cond_3

    .line 105
    .line 106
    iget-object v0, p0, Lx2/l;->a:Ljava/lang/String;

    .line 107
    .line 108
    :cond_3
    iget-object p1, p1, Lw2/g;->b:Lw2/e;

    .line 109
    .line 110
    sget-object v2, Lq6/j;->t:Lq6/j;

    .line 111
    .line 112
    invoke-static {v0}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v2, "SHA-256"

    .line 117
    .line 118
    invoke-virtual {v0, v2}, Lq6/j;->b(Ljava/lang/String;)Lq6/j;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lq6/j;->d()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Lw2/e;->b(Ljava/lang/String;)LK2/a;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    new-instance v0, Li3/a;

    .line 133
    .line 134
    invoke-direct {v0, p2, p1}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    move-object v0, v1

    .line 139
    :goto_0
    if-nez v0, :cond_5

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_5
    const/4 p1, 0x0

    .line 144
    :try_start_1
    iget p2, p3, Ld6/u;->t:I

    .line 145
    .line 146
    const/16 v2, 0x130

    .line 147
    .line 148
    if-ne p2, v2, :cond_7

    .line 149
    .line 150
    if-eqz p4, :cond_7

    .line 151
    .line 152
    invoke-virtual {p3}, Ld6/u;->b()Ld6/t;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    iget-object p4, p4, LC2/b;->f:Ld6/l;

    .line 157
    .line 158
    iget-object v2, p3, Ld6/u;->v:Ld6/l;

    .line 159
    .line 160
    invoke-static {p4, v2}, LC3/a;->o(Ld6/l;Ld6/l;)Ld6/l;

    .line 161
    .line 162
    .line 163
    move-result-object p4

    .line 164
    invoke-virtual {p4}, Ld6/l;->h()Lc3/c;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    iput-object p4, p2, Ld6/t;->f:Lc3/c;

    .line 169
    .line 170
    invoke-virtual {p2}, Ld6/t;->a()Ld6/u;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    iget-object v2, v0, Li3/a;->r:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, LK2/a;

    .line 181
    .line 182
    invoke-virtual {v2, p1}, LK2/a;->b(I)Lq6/x;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {p4, v2, p1}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 187
    .line 188
    .line 189
    move-result-object p4

    .line 190
    invoke-static {p4}, La/a;->i(Lq6/E;)Lq6/z;

    .line 191
    .line 192
    .line 193
    move-result-object p4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 194
    :try_start_2
    new-instance v2, LC2/b;

    .line 195
    .line 196
    invoke-direct {v2, p2}, LC2/b;-><init>(Ld6/u;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, p4}, LC2/b;->a(Lq6/z;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 200
    .line 201
    .line 202
    :try_start_3
    invoke-virtual {p4}, Lq6/z;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :catchall_1
    move-exception v1

    .line 207
    goto :goto_1

    .line 208
    :catchall_2
    move-exception p2

    .line 209
    move-object v1, p2

    .line 210
    :try_start_4
    invoke-virtual {p4}, Lq6/z;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :catchall_3
    move-exception p2

    .line 215
    :try_start_5
    invoke-static {v1, p2}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    :goto_1
    if-nez v1, :cond_6

    .line 219
    .line 220
    goto/16 :goto_5

    .line 221
    .line 222
    :cond_6
    throw v1

    .line 223
    :catchall_4
    move-exception p1

    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :catch_0
    move-exception p2

    .line 227
    goto/16 :goto_6

    .line 228
    .line 229
    :cond_7
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    iget-object p4, v0, Li3/a;->r:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p4, LK2/a;

    .line 236
    .line 237
    invoke-virtual {p4, p1}, LK2/a;->b(I)Lq6/x;

    .line 238
    .line 239
    .line 240
    move-result-object p4

    .line 241
    invoke-virtual {p2, p4, p1}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-static {p2}, La/a;->i(Lq6/E;)Lq6/z;

    .line 246
    .line 247
    .line 248
    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 249
    :try_start_6
    new-instance p4, LC2/b;

    .line 250
    .line 251
    invoke-direct {p4, p3}, LC2/b;-><init>(Ld6/u;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p4, p2}, LC2/b;->a(Lq6/z;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 255
    .line 256
    .line 257
    :try_start_7
    invoke-virtual {p2}, Lq6/z;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 258
    .line 259
    .line 260
    move-object p2, v1

    .line 261
    goto :goto_3

    .line 262
    :catchall_5
    move-exception p2

    .line 263
    goto :goto_3

    .line 264
    :catchall_6
    move-exception p4

    .line 265
    :try_start_8
    invoke-virtual {p2}, Lq6/z;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :catchall_7
    move-exception p2

    .line 270
    :try_start_9
    invoke-static {p4, p2}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    :goto_2
    move-object p2, p4

    .line 274
    :goto_3
    if-nez p2, :cond_9

    .line 275
    .line 276
    invoke-virtual {p0}, Lx2/l;->c()Lq6/l;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    iget-object p4, v0, Li3/a;->r:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast p4, LK2/a;

    .line 283
    .line 284
    const/4 v2, 0x1

    .line 285
    invoke-virtual {p4, v2}, LK2/a;->b(I)Lq6/x;

    .line 286
    .line 287
    .line 288
    move-result-object p4

    .line 289
    invoke-virtual {p2, p4, p1}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    invoke-static {p2}, La/a;->i(Lq6/E;)Lq6/z;

    .line 294
    .line 295
    .line 296
    move-result-object p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 297
    :try_start_a
    iget-object p4, p3, Ld6/u;->w:Ld6/w;

    .line 298
    .line 299
    invoke-static {p4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p4}, Ld6/w;->O()Lq6/i;

    .line 303
    .line 304
    .line 305
    move-result-object p4

    .line 306
    invoke-interface {p4, p2}, Lq6/i;->T(Lq6/h;)J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 307
    .line 308
    .line 309
    :try_start_b
    invoke-virtual {p2}, Lq6/z;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :catchall_8
    move-exception v1

    .line 314
    goto :goto_4

    .line 315
    :catchall_9
    move-exception p4

    .line 316
    move-object v1, p4

    .line 317
    :try_start_c
    invoke-virtual {p2}, Lq6/z;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 318
    .line 319
    .line 320
    goto :goto_4

    .line 321
    :catchall_a
    move-exception p2

    .line 322
    :try_start_d
    invoke-static {v1, p2}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    :goto_4
    if-nez v1, :cond_8

    .line 326
    .line 327
    :goto_5
    invoke-virtual {v0}, Li3/a;->k()Lk3/a;

    .line 328
    .line 329
    .line 330
    move-result-object p1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 331
    invoke-static {p3}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 332
    .line 333
    .line 334
    return-object p1

    .line 335
    :cond_8
    :try_start_e
    throw v1

    .line 336
    :cond_9
    throw p2
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 337
    :goto_6
    :try_start_f
    sget-object p4, LH2/f;->a:[Landroid/graphics/Bitmap$Config;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 338
    .line 339
    :try_start_10
    iget-object p4, v0, Li3/a;->r:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast p4, LK2/a;

    .line 342
    .line 343
    invoke-virtual {p4, p1}, LK2/a;->a(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 344
    .line 345
    .line 346
    :catch_1
    :try_start_11
    throw p2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 347
    :goto_7
    invoke-static {p3}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 348
    .line 349
    .line 350
    throw p1

    .line 351
    :cond_a
    if-eqz p1, :cond_b

    .line 352
    .line 353
    invoke-static {p1}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 354
    .line 355
    .line 356
    :cond_b
    :goto_8
    return-object v1
.end method
