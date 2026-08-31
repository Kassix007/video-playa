.class public final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;

.field public static final b:LP/T0;

.field public static final c:LP/T0;

.field public static final d:LP/T0;

.field public static final e:LP/T0;

.field public static final f:LP/T0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LC0/X;->r:LC0/X;

    .line 2
    .line 3
    new-instance v1, LP/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 9
    .line 10
    sget-object v0, LC0/X;->s:LC0/X;

    .line 11
    .line 12
    new-instance v1, LP/T0;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 18
    .line 19
    sget-object v0, LC0/X;->t:LC0/X;

    .line 20
    .line 21
    new-instance v1, LP/T0;

    .line 22
    .line 23
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:LP/T0;

    .line 27
    .line 28
    sget-object v0, LC0/X;->u:LC0/X;

    .line 29
    .line 30
    new-instance v1, LP/T0;

    .line 31
    .line 32
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:LP/T0;

    .line 36
    .line 37
    sget-object v0, LC0/X;->v:LC0/X;

    .line 38
    .line 39
    new-instance v1, LP/T0;

    .line 40
    .line 41
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:LP/T0;

    .line 45
    .line 46
    sget-object v0, LC0/X;->w:LC0/X;

    .line 47
    .line 48
    new-instance v1, LP/T0;

    .line 49
    .line 50
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 54
    .line 55
    return-void
.end method

.method public static final a(LC0/A;LB5/e;LP/o;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const v4, 0x5342453c

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v4}, LP/o;->U(I)LP/o;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    move v4, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x2

    .line 25
    :goto_0
    or-int/2addr v4, v3

    .line 26
    invoke-virtual {v2, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    const/16 v7, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v7, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v4, v7

    .line 38
    and-int/lit8 v7, v4, 0x13

    .line 39
    .line 40
    const/16 v8, 0x12

    .line 41
    .line 42
    const/4 v10, 0x1

    .line 43
    if-eq v7, v8, :cond_2

    .line 44
    .line 45
    move v7, v10

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/4 v7, 0x0

    .line 48
    :goto_2
    and-int/2addr v4, v10

    .line 49
    invoke-virtual {v2, v4, v7}, LP/o;->K(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1a

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    sget-object v8, LP/k;->a:LP/S;

    .line 64
    .line 65
    if-ne v7, v8, :cond_3

    .line 66
    .line 67
    new-instance v7, Landroid/content/res/Configuration;

    .line 68
    .line 69
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-virtual {v11}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-direct {v7, v11}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v2, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    check-cast v7, LP/W;

    .line 88
    .line 89
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    if-ne v11, v8, :cond_4

    .line 94
    .line 95
    new-instance v11, LB0/a;

    .line 96
    .line 97
    invoke-direct {v11, v5, v7}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    check-cast v11, LB5/c;

    .line 104
    .line 105
    invoke-virtual {v0, v11}, LC0/A;->setConfigurationChangeObserver(LB5/c;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-ne v5, v8, :cond_5

    .line 113
    .line 114
    new-instance v5, LC0/i0;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    check-cast v5, LC0/i0;

    .line 123
    .line 124
    invoke-virtual {v0}, LC0/A;->getViewTreeOwners()LC0/n;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-eqz v11, :cond_19

    .line 129
    .line 130
    iget-object v12, v11, LC0/n;->b:Lg2/e;

    .line 131
    .line 132
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    if-ne v13, v8, :cond_a

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    const-string v14, "null cannot be cast to non-null type android.view.View"

    .line 143
    .line 144
    invoke-static {v13, v14}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    check-cast v13, Landroid/view/View;

    .line 148
    .line 149
    const v14, 0x7f090087

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13, v14}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    instance-of v15, v14, Ljava/lang/String;

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    if-eqz v15, :cond_6

    .line 161
    .line 162
    check-cast v14, Ljava/lang/String;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    move-object/from16 v14, v16

    .line 166
    .line 167
    :goto_3
    if-nez v14, :cond_7

    .line 168
    .line 169
    invoke-virtual {v13}, Landroid/view/View;->getId()I

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    :cond_7
    new-instance v13, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-class v15, LZ/i;

    .line 183
    .line 184
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const/16 v15, 0x3a

    .line 192
    .line 193
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    invoke-interface {v12}, Lg2/e;->b()LZ/m;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    invoke-virtual {v14, v13}, LZ/m;->h(Ljava/lang/String;)Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    if-eqz v15, :cond_9

    .line 212
    .line 213
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v15}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 219
    .line 220
    .line 221
    move-result-object v16

    .line 222
    check-cast v16, Ljava/lang/Iterable;

    .line 223
    .line 224
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v16

    .line 228
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v17

    .line 232
    if-eqz v17, :cond_8

    .line 233
    .line 234
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v17

    .line 238
    move-object/from16 v10, v17

    .line 239
    .line 240
    check-cast v10, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v15, v10}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    move-object/from16 v18, v7

    .line 247
    .line 248
    const-string v7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }"

    .line 249
    .line 250
    invoke-static {v9, v7}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v6, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-object/from16 v7, v18

    .line 257
    .line 258
    const/4 v10, 0x1

    .line 259
    goto :goto_4

    .line 260
    :cond_8
    :goto_5
    move-object/from16 v18, v7

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_9
    move-object/from16 v6, v16

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :goto_6
    sget-object v7, LC0/p;->u:LC0/p;

    .line 267
    .line 268
    sget-object v9, LZ/k;->a:LP/T0;

    .line 269
    .line 270
    new-instance v9, LZ/j;

    .line 271
    .line 272
    invoke-direct {v9, v6, v7}, LZ/j;-><init>(Ljava/util/Map;LB5/c;)V

    .line 273
    .line 274
    .line 275
    :try_start_0
    new-instance v6, LC0/x0;

    .line 276
    .line 277
    const/4 v7, 0x0

    .line 278
    invoke-direct {v6, v7, v9}, LC0/x0;-><init>(ILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v14, v13, v6}, LZ/m;->C(Ljava/lang/String;Lg2/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    .line 283
    .line 284
    const/4 v6, 0x1

    .line 285
    goto :goto_7

    .line 286
    :catch_0
    const/4 v6, 0x0

    .line 287
    :goto_7
    new-instance v7, LC0/w0;

    .line 288
    .line 289
    new-instance v10, LC0/y0;

    .line 290
    .line 291
    invoke-direct {v10, v6, v14, v13}, LC0/y0;-><init>(ZLZ/m;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v7, v9, v10}, LC0/w0;-><init>(LZ/j;LC0/y0;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    move-object v13, v7

    .line 301
    goto :goto_8

    .line 302
    :cond_a
    move-object/from16 v18, v7

    .line 303
    .line 304
    :goto_8
    check-cast v13, LC0/w0;

    .line 305
    .line 306
    invoke-virtual {v2, v13}, LP/o;->i(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    if-nez v6, :cond_b

    .line 315
    .line 316
    if-ne v7, v8, :cond_c

    .line 317
    .line 318
    :cond_b
    new-instance v7, LB0/a;

    .line 319
    .line 320
    const/4 v6, 0x5

    .line 321
    invoke-direct {v7, v6, v13}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_c
    check-cast v7, LB5/c;

    .line 328
    .line 329
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 330
    .line 331
    invoke-static {v6, v7, v2}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    if-ne v6, v8, :cond_e

    .line 339
    .line 340
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 341
    .line 342
    const/16 v7, 0x1f

    .line 343
    .line 344
    if-lt v6, v7, :cond_d

    .line 345
    .line 346
    const-class v6, Landroid/os/Vibrator;

    .line 347
    .line 348
    invoke-virtual {v4, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    check-cast v6, Landroid/os/Vibrator;

    .line 353
    .line 354
    const/4 v7, 0x7

    .line 355
    const/4 v9, 0x2

    .line 356
    const/4 v10, 0x1

    .line 357
    filled-new-array {v10, v7, v9}, [I

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    invoke-static {v6, v7}, LC0/D0;->w(Landroid/os/Vibrator;[I)Z

    .line 362
    .line 363
    .line 364
    move-result v6

    .line 365
    if-eqz v6, :cond_d

    .line 366
    .line 367
    new-instance v6, LC0/u0;

    .line 368
    .line 369
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 370
    .line 371
    .line 372
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 373
    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_d
    new-instance v6, LC0/u0;

    .line 377
    .line 378
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 379
    .line 380
    .line 381
    :goto_9
    invoke-virtual {v2, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_e
    check-cast v6, Lr0/a;

    .line 385
    .line 386
    invoke-interface/range {v18 .. v18}, LP/S0;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    check-cast v7, Landroid/content/res/Configuration;

    .line 391
    .line 392
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    if-ne v9, v8, :cond_f

    .line 397
    .line 398
    new-instance v9, LG0/c;

    .line 399
    .line 400
    invoke-direct {v9}, LG0/c;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_f
    check-cast v9, LG0/c;

    .line 407
    .line 408
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    if-ne v10, v8, :cond_11

    .line 413
    .line 414
    new-instance v10, Landroid/content/res/Configuration;

    .line 415
    .line 416
    invoke-direct {v10}, Landroid/content/res/Configuration;-><init>()V

    .line 417
    .line 418
    .line 419
    if-eqz v7, :cond_10

    .line 420
    .line 421
    invoke-virtual {v10, v7}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 422
    .line 423
    .line 424
    :cond_10
    invoke-virtual {v2, v10}, LP/o;->d0(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_11
    check-cast v10, Landroid/content/res/Configuration;

    .line 428
    .line 429
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v7

    .line 433
    if-ne v7, v8, :cond_12

    .line 434
    .line 435
    new-instance v7, LC0/a0;

    .line 436
    .line 437
    invoke-direct {v7, v10, v9}, LC0/a0;-><init>(Landroid/content/res/Configuration;LG0/c;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_12
    check-cast v7, LC0/a0;

    .line 444
    .line 445
    invoke-virtual {v2, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v14

    .line 453
    if-nez v10, :cond_13

    .line 454
    .line 455
    if-ne v14, v8, :cond_14

    .line 456
    .line 457
    :cond_13
    new-instance v14, LA/Y;

    .line 458
    .line 459
    const/4 v10, 0x1

    .line 460
    invoke-direct {v14, v10, v4, v7}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v14}, LP/o;->d0(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    :cond_14
    check-cast v14, LB5/c;

    .line 467
    .line 468
    invoke-static {v9, v14, v2}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    if-ne v7, v8, :cond_15

    .line 476
    .line 477
    new-instance v7, LG0/d;

    .line 478
    .line 479
    invoke-direct {v7}, LG0/d;-><init>()V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    :cond_15
    check-cast v7, LG0/d;

    .line 486
    .line 487
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    if-ne v10, v8, :cond_16

    .line 492
    .line 493
    new-instance v10, LC0/b0;

    .line 494
    .line 495
    invoke-direct {v10, v7}, LC0/b0;-><init>(LG0/d;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v10}, LP/o;->d0(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :cond_16
    check-cast v10, LC0/b0;

    .line 502
    .line 503
    invoke-virtual {v2, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v14

    .line 507
    invoke-virtual {v2}, LP/o;->H()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v15

    .line 511
    if-nez v14, :cond_17

    .line 512
    .line 513
    if-ne v15, v8, :cond_18

    .line 514
    .line 515
    :cond_17
    new-instance v15, LA/Y;

    .line 516
    .line 517
    const/4 v8, 0x2

    .line 518
    invoke-direct {v15, v8, v4, v10}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v15}, LP/o;->d0(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    :cond_18
    check-cast v15, LB5/c;

    .line 525
    .line 526
    invoke-static {v7, v15, v2}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 527
    .line 528
    .line 529
    sget-object v8, LC0/t0;->v:LP/z;

    .line 530
    .line 531
    invoke-virtual {v2, v8}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    check-cast v10, Ljava/lang/Boolean;

    .line 536
    .line 537
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 538
    .line 539
    .line 540
    move-result v10

    .line 541
    invoke-virtual {v0}, LC0/A;->getScrollCaptureInProgress$ui_release()Z

    .line 542
    .line 543
    .line 544
    move-result v14

    .line 545
    or-int/2addr v10, v14

    .line 546
    invoke-interface/range {v18 .. v18}, LP/S0;->getValue()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    check-cast v14, Landroid/content/res/Configuration;

    .line 551
    .line 552
    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 553
    .line 554
    invoke-virtual {v15, v14}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 555
    .line 556
    .line 557
    move-result-object v18

    .line 558
    sget-object v14, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 559
    .line 560
    invoke-virtual {v14, v4}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 561
    .line 562
    .line 563
    move-result-object v19

    .line 564
    sget-object v4, LN1/a;->a:LP/l0;

    .line 565
    .line 566
    iget-object v11, v11, LC0/n;->a:Landroidx/lifecycle/x;

    .line 567
    .line 568
    invoke-virtual {v4, v11}, LP/l0;->a(Ljava/lang/Object;)LP/m0;

    .line 569
    .line 570
    .line 571
    move-result-object v20

    .line 572
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:LP/T0;

    .line 573
    .line 574
    invoke-virtual {v4, v12}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 575
    .line 576
    .line 577
    move-result-object v21

    .line 578
    sget-object v4, LZ/k;->a:LP/T0;

    .line 579
    .line 580
    invoke-virtual {v4, v13}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 581
    .line 582
    .line 583
    move-result-object v22

    .line 584
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 585
    .line 586
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    invoke-virtual {v4, v11}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 591
    .line 592
    .line 593
    move-result-object v23

    .line 594
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:LP/T0;

    .line 595
    .line 596
    invoke-virtual {v4, v9}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 597
    .line 598
    .line 599
    move-result-object v24

    .line 600
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:LP/T0;

    .line 601
    .line 602
    invoke-virtual {v4, v7}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 603
    .line 604
    .line 605
    move-result-object v25

    .line 606
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    invoke-virtual {v8, v4}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 611
    .line 612
    .line 613
    move-result-object v26

    .line 614
    sget-object v4, LC0/t0;->l:LP/T0;

    .line 615
    .line 616
    invoke-virtual {v4, v6}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 617
    .line 618
    .line 619
    move-result-object v27

    .line 620
    filled-new-array/range {v18 .. v27}, [LP/m0;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    new-instance v6, LC0/Z;

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    invoke-direct {v6, v0, v5, v1, v7}, LC0/Z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 628
    .line 629
    .line 630
    const v5, 0x57b729fc

    .line 631
    .line 632
    .line 633
    invoke-static {v5, v6, v2}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    const/16 v6, 0x38

    .line 638
    .line 639
    invoke-static {v4, v5, v2, v6}, LP/b;->b([LP/m0;LB5/e;LP/o;I)V

    .line 640
    .line 641
    .line 642
    goto :goto_a

    .line 643
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 644
    .line 645
    const-string v1, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    .line 646
    .line 647
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    throw v0

    .line 651
    :cond_1a
    invoke-virtual {v2}, LP/o;->N()V

    .line 652
    .line 653
    .line 654
    :goto_a
    invoke-virtual {v2}, LP/o;->r()LP/o0;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    if-eqz v2, :cond_1b

    .line 659
    .line 660
    new-instance v4, LB0/j0;

    .line 661
    .line 662
    const/4 v10, 0x1

    .line 663
    invoke-direct {v4, v3, v10, v0, v1}, LB0/j0;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    iput-object v4, v2, LP/o0;->d:LB5/e;

    .line 667
    .line 668
    :cond_1b
    return-void
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public static final getLocalLifecycleOwner()LP/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LP/l0;"
        }
    .end annotation

    .line 1
    sget-object v0, LN1/a;->a:LP/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getLocalSavedStateRegistryOwner()LP/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LP/l0;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:LP/T0;

    .line 2
    .line 3
    return-object v0
.end method
