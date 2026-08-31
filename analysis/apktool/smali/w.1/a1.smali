.class public final Lw/a1;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:Lw/g0;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Lv0/l;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:LM5/w;

.field public final synthetic x:LB5/f;

.field public final synthetic y:LB5/c;

.field public final synthetic z:LB5/c;


# direct methods
.method public constructor <init>(LM5/w;LB5/f;LB5/c;LB5/c;Lw/g0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/a1;->w:LM5/w;

    .line 2
    .line 3
    iput-object p2, p0, Lw/a1;->x:LB5/f;

    .line 4
    .line 5
    iput-object p3, p0, Lw/a1;->y:LB5/c;

    .line 6
    .line 7
    iput-object p4, p0, Lw/a1;->z:LB5/c;

    .line 8
    .line 9
    iput-object p5, p0, Lw/a1;->A:Lw/g0;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/h;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, Lw/a1;

    .line 2
    .line 3
    iget-object v4, p0, Lw/a1;->z:LB5/c;

    .line 4
    .line 5
    iget-object v5, p0, Lw/a1;->A:Lw/g0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/a1;->w:LM5/w;

    .line 8
    .line 9
    iget-object v2, p0, Lw/a1;->x:LB5/f;

    .line 10
    .line 11
    iget-object v3, p0, Lw/a1;->y:LB5/c;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lw/a1;-><init>(LM5/w;LB5/f;LB5/c;LB5/c;Lw/g0;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, Lw/a1;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/a1;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/a1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/a1;->u:I

    .line 4
    .line 5
    sget-object v2, LM5/x;->t:LM5/x;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    sget-object v4, Lv0/g;->r:Lv0/g;

    .line 9
    .line 10
    iget-object v5, v0, Lw/a1;->w:LM5/w;

    .line 11
    .line 12
    sget-object v6, Lw/N;->a:Lw/N;

    .line 13
    .line 14
    iget-object v7, v0, Lw/a1;->x:LB5/f;

    .line 15
    .line 16
    iget-object v8, v0, Lw/a1;->z:LB5/c;

    .line 17
    .line 18
    sget-object v9, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    iget-object v10, v0, Lw/a1;->y:LB5/c;

    .line 21
    .line 22
    iget-object v12, v0, Lw/a1;->A:Lw/g0;

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    sget-object v14, Lr5/a;->q:Lr5/a;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :pswitch_0
    iget-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LM5/b0;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v16, v9

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :pswitch_1
    iget-object v1, v0, Lw/a1;->t:Lv0/l;

    .line 50
    .line 51
    iget-object v2, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lv0/l;

    .line 54
    .line 55
    iget-object v3, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, LM5/b0;

    .line 58
    .line 59
    iget-object v4, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Lv0/y;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v11, v3

    .line 67
    move-object v3, v2

    .line 68
    move-object v2, v11

    .line 69
    move-object v11, v1

    .line 70
    move-object/from16 v16, v9

    .line 71
    .line 72
    move-object/from16 v1, p1

    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :pswitch_2
    iget-object v1, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lv0/l;

    .line 79
    .line 80
    iget-object v2, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, LM5/b0;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v3, v1

    .line 88
    move-object/from16 v16, v9

    .line 89
    .line 90
    move-object/from16 v1, p1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_3
    iget-object v1, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, LM5/b0;

    .line 96
    .line 97
    iget-object v3, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lv0/l;

    .line 100
    .line 101
    iget-object v15, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v15, Lv0/y;

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v11, p1

    .line 109
    .line 110
    check-cast v11, Lv0/l;

    .line 111
    .line 112
    if-nez v11, :cond_0

    .line 113
    .line 114
    iget-wide v1, v3, Lv0/l;->c:J

    .line 115
    .line 116
    new-instance v3, Li0/b;

    .line 117
    .line 118
    invoke-direct {v3, v1, v2}, Li0/b;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v8, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-object v9

    .line 125
    :cond_0
    sget-object v16, Lw/g1;->a:Le3/u;

    .line 126
    .line 127
    move-object/from16 v16, v9

    .line 128
    .line 129
    new-instance v9, Lw/U0;

    .line 130
    .line 131
    invoke-direct {v9, v1, v12, v13}, Lw/U0;-><init>(LM5/b0;Lw/g0;Lq5/c;)V

    .line 132
    .line 133
    .line 134
    const/4 v1, 0x1

    .line 135
    invoke-static {v5, v13, v2, v9, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    sget-object v1, Lw/g1;->a:Le3/u;

    .line 140
    .line 141
    if-eq v7, v1, :cond_1

    .line 142
    .line 143
    new-instance v1, Lw/V0;

    .line 144
    .line 145
    invoke-direct {v1, v7, v12, v11, v13}, Lw/V0;-><init>(LB5/f;Lw/g0;Lv0/l;Lq5/c;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v5, v2, v1}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 149
    .line 150
    .line 151
    :cond_1
    if-nez v10, :cond_3

    .line 152
    .line 153
    iput-object v2, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v3, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v13, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v1, 0x6

    .line 160
    iput v1, v0, Lw/a1;->u:I

    .line 161
    .line 162
    invoke-static {v15, v4, v0}, Lw/g1;->g(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-ne v1, v14, :cond_2

    .line 167
    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :cond_2
    :goto_0
    check-cast v1, Lv0/l;

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_3
    iput-object v15, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v2, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v3, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v11, v0, Lw/a1;->t:Lv0/l;

    .line 180
    .line 181
    const/4 v1, 0x7

    .line 182
    iput v1, v0, Lw/a1;->u:I

    .line 183
    .line 184
    invoke-static {v15, v4, v0}, Lw/g1;->f(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-ne v1, v14, :cond_4

    .line 189
    .line 190
    goto/16 :goto_7

    .line 191
    .line 192
    :cond_4
    move-object v4, v15

    .line 193
    :goto_1
    check-cast v1, Lw/O;

    .line 194
    .line 195
    invoke-static {v1, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-eqz v6, :cond_6

    .line 200
    .line 201
    iget-wide v6, v11, Lv0/l;->c:J

    .line 202
    .line 203
    new-instance v1, Li0/b;

    .line 204
    .line 205
    invoke-direct {v1, v6, v7}, Li0/b;-><init>(J)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v10, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    iput-object v2, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v13, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v13, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v13, v0, Lw/a1;->t:Lv0/l;

    .line 218
    .line 219
    const/16 v1, 0x8

    .line 220
    .line 221
    iput v1, v0, Lw/a1;->u:I

    .line 222
    .line 223
    invoke-static {v4, v0}, Lw/g1;->a(Lv0/y;Ls5/a;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-ne v1, v14, :cond_5

    .line 228
    .line 229
    goto/16 :goto_7

    .line 230
    .line 231
    :cond_5
    move-object v1, v2

    .line 232
    :goto_2
    new-instance v2, Lw/Z0;

    .line 233
    .line 234
    invoke-direct {v2, v12, v13}, Lw/Z0;-><init>(Lw/g0;Lq5/c;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v5, v1, v2}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 238
    .line 239
    .line 240
    return-object v16

    .line 241
    :cond_6
    instance-of v4, v1, Lw/M;

    .line 242
    .line 243
    if-eqz v4, :cond_7

    .line 244
    .line 245
    check-cast v1, Lw/M;

    .line 246
    .line 247
    iget-object v1, v1, Lw/M;->a:Lv0/l;

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    instance-of v1, v1, Lw/L;

    .line 251
    .line 252
    if-eqz v1, :cond_9

    .line 253
    .line 254
    move-object v1, v13

    .line 255
    :goto_3
    if-nez v1, :cond_8

    .line 256
    .line 257
    new-instance v1, Lw/X0;

    .line 258
    .line 259
    invoke-direct {v1, v12, v13}, Lw/X0;-><init>(Lw/g0;Lq5/c;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v5, v2, v1}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 263
    .line 264
    .line 265
    iget-wide v1, v3, Lv0/l;->c:J

    .line 266
    .line 267
    new-instance v3, Li0/b;

    .line 268
    .line 269
    invoke-direct {v3, v1, v2}, Li0/b;-><init>(J)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v8, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    return-object v16

    .line 276
    :cond_8
    invoke-virtual {v1}, Lv0/l;->a()V

    .line 277
    .line 278
    .line 279
    new-instance v1, Lw/W0;

    .line 280
    .line 281
    invoke-direct {v1, v12, v13}, Lw/W0;-><init>(Lw/g0;Lq5/c;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v5, v2, v1}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 285
    .line 286
    .line 287
    throw v13

    .line 288
    :cond_9
    new-instance v1, LC2/e;

    .line 289
    .line 290
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 291
    .line 292
    .line 293
    throw v1

    .line 294
    :pswitch_4
    move-object/from16 v16, v9

    .line 295
    .line 296
    iget-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, LM5/b0;

    .line 299
    .line 300
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :pswitch_5
    move-object/from16 v16, v9

    .line 306
    .line 307
    iget-object v1, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v1, LM5/b0;

    .line 310
    .line 311
    iget-object v2, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v2, Lv0/l;

    .line 314
    .line 315
    iget-object v3, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, Lv0/y;

    .line 318
    .line 319
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    move-object v4, v3

    .line 323
    move-object/from16 v3, p1

    .line 324
    .line 325
    goto/16 :goto_6

    .line 326
    .line 327
    :pswitch_6
    move-object/from16 v16, v9

    .line 328
    .line 329
    iget-object v1, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, LM5/b0;

    .line 332
    .line 333
    iget-object v2, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v2, Lv0/y;

    .line 336
    .line 337
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    move-object v2, v1

    .line 341
    move-object/from16 v1, p1

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :pswitch_7
    move-object/from16 v16, v9

    .line 345
    .line 346
    iget-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v1, Lv0/y;

    .line 349
    .line 350
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v11, p1

    .line 354
    .line 355
    const/4 v9, 0x1

    .line 356
    goto :goto_4

    .line 357
    :pswitch_8
    move-object/from16 v16, v9

    .line 358
    .line 359
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v1, Lv0/y;

    .line 365
    .line 366
    iput-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 367
    .line 368
    const/4 v9, 0x1

    .line 369
    iput v9, v0, Lw/a1;->u:I

    .line 370
    .line 371
    invoke-static {v1, v0, v3}, Lw/g1;->c(Lv0/y;Ls5/h;I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    if-ne v11, v14, :cond_a

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_a
    :goto_4
    check-cast v11, Lv0/l;

    .line 379
    .line 380
    invoke-virtual {v11}, Lv0/l;->a()V

    .line 381
    .line 382
    .line 383
    sget-object v15, Lw/g1;->a:Le3/u;

    .line 384
    .line 385
    new-instance v15, Lw/Y0;

    .line 386
    .line 387
    invoke-direct {v15, v12, v13}, Lw/Y0;-><init>(Lw/g0;Lq5/c;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v5, v13, v2, v15, v9}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    sget-object v9, Lw/g1;->a:Le3/u;

    .line 395
    .line 396
    if-eq v7, v9, :cond_b

    .line 397
    .line 398
    new-instance v9, Lw/Q0;

    .line 399
    .line 400
    invoke-direct {v9, v7, v12, v11, v13}, Lw/Q0;-><init>(LB5/f;Lw/g0;Lv0/l;Lq5/c;)V

    .line 401
    .line 402
    .line 403
    invoke-static {v5, v2, v9}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 404
    .line 405
    .line 406
    :cond_b
    if-nez v10, :cond_d

    .line 407
    .line 408
    iput-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 409
    .line 410
    iput-object v2, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 411
    .line 412
    const/4 v3, 0x2

    .line 413
    iput v3, v0, Lw/a1;->u:I

    .line 414
    .line 415
    invoke-static {v1, v4, v0}, Lw/g1;->g(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    if-ne v1, v14, :cond_c

    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_c
    :goto_5
    check-cast v1, Lv0/l;

    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_d
    iput-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 426
    .line 427
    iput-object v11, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 428
    .line 429
    iput-object v2, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 430
    .line 431
    iput v3, v0, Lw/a1;->u:I

    .line 432
    .line 433
    invoke-static {v1, v4, v0}, Lw/g1;->f(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    if-ne v3, v14, :cond_e

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_e
    move-object v4, v1

    .line 441
    move-object v1, v2

    .line 442
    move-object v2, v11

    .line 443
    :goto_6
    check-cast v3, Lw/O;

    .line 444
    .line 445
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-eqz v6, :cond_10

    .line 450
    .line 451
    iget-wide v2, v2, Lv0/l;->c:J

    .line 452
    .line 453
    new-instance v6, Li0/b;

    .line 454
    .line 455
    invoke-direct {v6, v2, v3}, Li0/b;-><init>(J)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v10, v6}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    iput-object v1, v0, Lw/a1;->v:Ljava/lang/Object;

    .line 462
    .line 463
    iput-object v13, v0, Lw/a1;->r:Ljava/lang/Object;

    .line 464
    .line 465
    iput-object v13, v0, Lw/a1;->s:Ljava/lang/Object;

    .line 466
    .line 467
    const/4 v2, 0x4

    .line 468
    iput v2, v0, Lw/a1;->u:I

    .line 469
    .line 470
    invoke-static {v4, v0}, Lw/g1;->a(Lv0/y;Ls5/a;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    if-ne v2, v14, :cond_f

    .line 475
    .line 476
    :goto_7
    return-object v14

    .line 477
    :cond_f
    :goto_8
    new-instance v2, Lw/R0;

    .line 478
    .line 479
    invoke-direct {v2, v12, v13}, Lw/R0;-><init>(Lw/g0;Lq5/c;)V

    .line 480
    .line 481
    .line 482
    invoke-static {v5, v1, v2}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 483
    .line 484
    .line 485
    return-object v16

    .line 486
    :cond_10
    instance-of v2, v3, Lw/M;

    .line 487
    .line 488
    if-eqz v2, :cond_11

    .line 489
    .line 490
    check-cast v3, Lw/M;

    .line 491
    .line 492
    iget-object v2, v3, Lw/M;->a:Lv0/l;

    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_11
    instance-of v2, v3, Lw/L;

    .line 496
    .line 497
    if-eqz v2, :cond_14

    .line 498
    .line 499
    move-object v2, v13

    .line 500
    :goto_9
    move-object/from16 v17, v2

    .line 501
    .line 502
    move-object v2, v1

    .line 503
    move-object/from16 v1, v17

    .line 504
    .line 505
    :goto_a
    if-nez v1, :cond_12

    .line 506
    .line 507
    new-instance v3, Lw/S0;

    .line 508
    .line 509
    invoke-direct {v3, v12, v13}, Lw/S0;-><init>(Lw/g0;Lq5/c;)V

    .line 510
    .line 511
    .line 512
    invoke-static {v5, v2, v3}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 513
    .line 514
    .line 515
    goto :goto_b

    .line 516
    :cond_12
    invoke-virtual {v1}, Lv0/l;->a()V

    .line 517
    .line 518
    .line 519
    new-instance v3, Lw/T0;

    .line 520
    .line 521
    invoke-direct {v3, v12, v13}, Lw/T0;-><init>(Lw/g0;Lq5/c;)V

    .line 522
    .line 523
    .line 524
    invoke-static {v5, v2, v3}, Lw/g1;->e(LM5/w;LM5/b0;LB5/e;)LM5/B;

    .line 525
    .line 526
    .line 527
    :goto_b
    if-eqz v1, :cond_13

    .line 528
    .line 529
    iget-wide v1, v1, Lv0/l;->c:J

    .line 530
    .line 531
    new-instance v3, Li0/b;

    .line 532
    .line 533
    invoke-direct {v3, v1, v2}, Li0/b;-><init>(J)V

    .line 534
    .line 535
    .line 536
    invoke-interface {v8, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    :cond_13
    return-object v16

    .line 540
    :cond_14
    new-instance v1, LC2/e;

    .line 541
    .line 542
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 543
    .line 544
    .line 545
    throw v1

    .line 546
    nop

    .line 547
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
