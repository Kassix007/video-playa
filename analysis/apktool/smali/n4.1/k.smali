.class public abstract Ln4/k;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final q:Ln4/d;

.field public final r:Lb4/b;

.field public final s:Ln4/g;

.field public t:Lk/h;

.field public u:Ln4/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const v4, 0x7f03007c

    .line 5
    .line 6
    .line 7
    const v5, 0x7f12034d

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    invoke-static {v1, v2, v4, v5}, Lx4/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    new-instance v7, Ln4/g;

    .line 20
    .line 21
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    iput-boolean v8, v7, Ln4/g;->r:Z

    .line 26
    .line 27
    iput-object v7, v0, Ln4/k;->s:Ln4/g;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/16 v9, 0xc

    .line 34
    .line 35
    const/16 v10, 0xa

    .line 36
    .line 37
    filled-new-array {v9, v10}, [I

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    sget-object v3, LV3/a;->x:[I

    .line 42
    .line 43
    invoke-static/range {v1 .. v6}, Ll4/m;->h(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)LB0/G0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v6, Ln4/d;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    invoke-virtual {v0}, Ln4/k;->getMaxItemCount()I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    invoke-direct {v6, v1, v11, v12}, Ln4/d;-><init>(Landroid/content/Context;Ljava/lang/Class;I)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v0, Ln4/k;->q:Ln4/d;

    .line 61
    .line 62
    new-instance v11, Lb4/b;

    .line 63
    .line 64
    invoke-direct {v11, v1}, Lb4/b;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    iput-object v11, v0, Ln4/k;->r:Lb4/b;

    .line 68
    .line 69
    iput-object v11, v7, Ln4/g;->q:Lb4/b;

    .line 70
    .line 71
    const/4 v12, 0x1

    .line 72
    iput v12, v7, Ln4/g;->s:I

    .line 73
    .line 74
    invoke-virtual {v11, v7}, Ln4/e;->setPresenter(Ln4/g;)V

    .line 75
    .line 76
    .line 77
    iget-object v13, v6, Ll/l;->a:Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {v6, v7, v13}, Ll/l;->b(Ll/x;Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    iget-object v13, v7, Ln4/g;->q:Lb4/b;

    .line 86
    .line 87
    iput-object v6, v13, Ln4/e;->U:Ll/l;

    .line 88
    .line 89
    iget-object v13, v3, LB0/G0;->s:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v13, Landroid/content/res/TypedArray;

    .line 92
    .line 93
    const/4 v14, 0x6

    .line 94
    invoke-virtual {v13, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_0

    .line 99
    .line 100
    invoke-virtual {v3, v14}, LB0/G0;->w(I)Landroid/content/res/ColorStateList;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    invoke-virtual {v11, v15}, Ln4/e;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v11}, Ln4/e;->c()Landroid/content/res/ColorStateList;

    .line 109
    .line 110
    .line 111
    move-result-object v15

    .line 112
    invoke-virtual {v11, v15}, Ln4/e;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v15

    .line 119
    const v14, 0x7f0602c5

    .line 120
    .line 121
    .line 122
    invoke-virtual {v15, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    const/4 v15, 0x5

    .line 127
    invoke-virtual {v13, v15, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    invoke-virtual {v0, v14}, Ln4/k;->setItemIconSize(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v13, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-eqz v14, :cond_1

    .line 139
    .line 140
    invoke-virtual {v13, v9, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    invoke-virtual {v0, v9}, Ln4/k;->setItemTextAppearanceInactive(I)V

    .line 145
    .line 146
    .line 147
    :cond_1
    invoke-virtual {v13, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_2

    .line 152
    .line 153
    invoke-virtual {v13, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    invoke-virtual {v0, v9}, Ln4/k;->setItemTextAppearanceActive(I)V

    .line 158
    .line 159
    .line 160
    :cond_2
    const/16 v9, 0xb

    .line 161
    .line 162
    invoke-virtual {v13, v9, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    invoke-virtual {v0, v9}, Ln4/k;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 167
    .line 168
    .line 169
    const/16 v9, 0xd

    .line 170
    .line 171
    invoke-virtual {v13, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_3

    .line 176
    .line 177
    invoke-virtual {v3, v9}, LB0/G0;->w(I)Landroid/content/res/ColorStateList;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-virtual {v0, v9}, Ln4/k;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 182
    .line 183
    .line 184
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-static {v9}, La/a;->A(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    if-eqz v9, :cond_4

    .line 193
    .line 194
    if-eqz v10, :cond_6

    .line 195
    .line 196
    :cond_4
    invoke-static {v1, v2, v4, v5}, Ls4/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Ls4/j;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Ls4/j;->a()Ls4/k;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    new-instance v4, Ls4/g;

    .line 205
    .line 206
    invoke-direct {v4, v2}, Ls4/g;-><init>(Ls4/k;)V

    .line 207
    .line 208
    .line 209
    if-eqz v10, :cond_5

    .line 210
    .line 211
    invoke-virtual {v4, v10}, Ls4/g;->k(Landroid/content/res/ColorStateList;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    invoke-virtual {v4, v1}, Ls4/g;->i(Landroid/content/Context;)V

    .line 215
    .line 216
    .line 217
    sget-object v2, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 218
    .line 219
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 220
    .line 221
    .line 222
    :cond_6
    const/16 v2, 0x8

    .line 223
    .line 224
    invoke-virtual {v13, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_7

    .line 229
    .line 230
    invoke-virtual {v13, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-virtual {v0, v2}, Ln4/k;->setItemPaddingTop(I)V

    .line 235
    .line 236
    .line 237
    :cond_7
    const/4 v2, 0x7

    .line 238
    invoke-virtual {v13, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_8

    .line 243
    .line 244
    invoke-virtual {v13, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    invoke-virtual {v0, v2}, Ln4/k;->setItemPaddingBottom(I)V

    .line 249
    .line 250
    .line 251
    :cond_8
    invoke-virtual {v13, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_9

    .line 256
    .line 257
    invoke-virtual {v13, v8, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {v0, v2}, Ln4/k;->setActiveIndicatorLabelPadding(I)V

    .line 262
    .line 263
    .line 264
    :cond_9
    const/4 v2, 0x2

    .line 265
    invoke-virtual {v13, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_a

    .line 270
    .line 271
    invoke-virtual {v13, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    int-to-float v4, v4

    .line 276
    invoke-virtual {v0, v4}, Ln4/k;->setElevation(F)V

    .line 277
    .line 278
    .line 279
    :cond_a
    invoke-static {v1, v3, v12}, Lcom/google/android/gms/internal/measurement/I1;->Y(Landroid/content/Context;LB0/G0;I)Landroid/content/res/ColorStateList;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 292
    .line 293
    .line 294
    const/16 v4, 0xe

    .line 295
    .line 296
    const/4 v5, -0x1

    .line 297
    invoke-virtual {v13, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-virtual {v0, v4}, Ln4/k;->setLabelVisibilityMode(I)V

    .line 302
    .line 303
    .line 304
    const/4 v4, 0x4

    .line 305
    invoke-virtual {v13, v4, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-eqz v5, :cond_b

    .line 310
    .line 311
    invoke-virtual {v11, v5}, Ln4/e;->setItemBackgroundRes(I)V

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_b
    const/16 v5, 0x9

    .line 316
    .line 317
    invoke-static {v1, v3, v5}, Lcom/google/android/gms/internal/measurement/I1;->Y(Landroid/content/Context;LB0/G0;I)Landroid/content/res/ColorStateList;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v0, v5}, Ln4/k;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 322
    .line 323
    .line 324
    :goto_1
    const/4 v5, 0x3

    .line 325
    invoke-virtual {v13, v5, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    if-eqz v9, :cond_c

    .line 330
    .line 331
    invoke-virtual {v0, v12}, Ln4/k;->setItemActiveIndicatorEnabled(Z)V

    .line 332
    .line 333
    .line 334
    sget-object v10, LV3/a;->w:[I

    .line 335
    .line 336
    invoke-virtual {v1, v9, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    invoke-virtual {v9, v12, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    invoke-virtual {v0, v10}, Ln4/k;->setItemActiveIndicatorWidth(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9, v8, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    invoke-virtual {v0, v10}, Ln4/k;->setItemActiveIndicatorHeight(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9, v5, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    invoke-virtual {v0, v5}, Ln4/k;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 359
    .line 360
    .line 361
    invoke-static {v1, v9, v2}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-virtual {v0, v2}, Ln4/k;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v9, v4, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    new-instance v4, Ls4/a;

    .line 373
    .line 374
    int-to-float v5, v8

    .line 375
    invoke-direct {v4, v5}, Ls4/a;-><init>(F)V

    .line 376
    .line 377
    .line 378
    invoke-static {v1, v2, v8, v4}, Ls4/k;->a(Landroid/content/Context;IILs4/a;)Ls4/j;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v1}, Ls4/j;->a()Ls4/k;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-virtual {v0, v1}, Ln4/k;->setItemActiveIndicatorShapeAppearance(Ls4/k;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 390
    .line 391
    .line 392
    :cond_c
    const/16 v1, 0xf

    .line 393
    .line 394
    invoke-virtual {v13, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_d

    .line 399
    .line 400
    invoke-virtual {v13, v1, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    iput-boolean v12, v7, Ln4/g;->r:Z

    .line 405
    .line 406
    invoke-direct {v0}, Ln4/k;->getMenuInflater()Landroid/view/MenuInflater;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v2, v1, v6}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 411
    .line 412
    .line 413
    iput-boolean v8, v7, Ln4/g;->r:Z

    .line 414
    .line 415
    invoke-virtual {v7, v12}, Ln4/g;->h(Z)V

    .line 416
    .line 417
    .line 418
    :cond_d
    invoke-virtual {v3}, LB0/G0;->R()V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 422
    .line 423
    .line 424
    new-instance v1, Li1/a;

    .line 425
    .line 426
    move-object v2, v0

    .line 427
    check-cast v2, Lb4/e;

    .line 428
    .line 429
    const/4 v3, 0x6

    .line 430
    invoke-direct {v1, v3, v2}, Li1/a;-><init>(ILjava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    iput-object v1, v6, Ll/l;->e:Ll/j;

    .line 434
    .line 435
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/k;->t:Lk/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lk/h;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ln4/k;->t:Lk/h;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ln4/k;->t:Lk/h;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getActiveIndicatorLabelPadding()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemActiveIndicatorHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemActiveIndicatorMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()Ls4/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemActiveIndicatorShapeAppearance()Ls4/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemActiveIndicatorWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemBackgroundResource()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemBackgroundRes()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemIconSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getIconTintList()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemPaddingBottom()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemRippleColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getItemTextColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract getMaxItemCount()I
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->q:Ln4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMenuView()Ll/z;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPresenter()Ln4/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->s:Ln4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getSelectedItemId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ls4/g;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ls4/g;

    .line 13
    .line 14
    invoke-static {p0, v0}, LC3/a;->Q(Landroid/view/View;Ls4/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4

    .line 1
    instance-of v0, p1, Ln4/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ln4/j;

    .line 10
    .line 11
    iget-object v0, p1, LC1/c;->q:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Ln4/j;->s:Landroid/os/Bundle;

    .line 17
    .line 18
    iget-object v0, p0, Ln4/k;->q:Ln4/d;

    .line 19
    .line 20
    iget-object v0, v0, Ll/l;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    const-string v1, "android:menu:presenters"

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ll/x;

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-interface {v3}, Ll/x;->getId()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-lez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Landroid/os/Parcelable;

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-interface {v3, v2}, Ll/x;->d(Landroid/os/Parcelable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 7

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ln4/j;

    .line 6
    .line 7
    invoke-direct {v1, v0}, LC1/c;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Ln4/j;->s:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, p0, Ln4/k;->q:Ln4/d;

    .line 18
    .line 19
    iget-object v2, v2, Ll/l;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    new-instance v3, Landroid/util/SparseArray;

    .line 29
    .line 30
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Ll/x;

    .line 54
    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface {v6}, Ll/x;->getId()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-lez v5, :cond_1

    .line 66
    .line 67
    invoke-interface {v6}, Ll/x;->k()Landroid/os/Parcelable;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-virtual {v3, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const-string v2, "android:menu:presenters"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setActiveIndicatorLabelPadding(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setElevation(F)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ls4/g;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ls4/g;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ls4/g;->j(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Ls4/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorShapeAppearance(Ls4/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemActiveIndicatorWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemBackgroundRes(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemIconSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSizeRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Ln4/k;->setItemIconSize(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemPaddingBottom(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemPaddingTop(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/e;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/k;->r:Lb4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/e;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ln4/e;->setLabelVisibilityMode(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Ln4/k;->s:Ln4/g;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ln4/g;->h(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setOnItemReselectedListener(Ln4/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnItemSelectedListener(Ln4/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/k;->u:Ln4/i;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedItemId(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/k;->q:Ln4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll/l;->findItem(I)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ln4/k;->s:Ln4/g;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, p1, v1, v2}, Ll/l;->q(Landroid/view/MenuItem;Ll/x;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
