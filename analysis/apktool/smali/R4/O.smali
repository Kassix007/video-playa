.class public final LR4/O;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final a:LR4/k1;

.field public final b:Lorg/json/JSONObject;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Ljava/util/List;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/lang/String;

.field public final h:LR4/V;


# direct methods
.method public constructor <init>(LR4/k1;)V
    .locals 5

    .line 1
    const-string v0, "dataObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LR4/O;->a:LR4/k1;

    .line 12
    .line 13
    new-instance v1, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LR4/O;->b:Lorg/json/JSONObject;

    .line 19
    .line 20
    new-instance v1, Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LR4/O;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v1, LR4/V;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, LR4/O;->h:LR4/V;

    .line 42
    .line 43
    iget-object v1, p1, LR4/k1;->l:Lk5/b;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v1, v1, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    new-instance v2, LR4/L;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-direct {v2, p0, v3}, LR4/L;-><init>(LR4/O;I)V

    .line 55
    .line 56
    .line 57
    new-instance v3, LR4/N;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v3, v2, v4}, LR4/N;-><init>(LB5/c;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object p1, p1, LR4/k1;->s:Lj5/c;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p1, p1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    new-instance v1, LR4/L;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-direct {v1, p0, v2}, LR4/L;-><init>(LR4/O;I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, LR4/N;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v2, v1, v3}, LR4/N;-><init>(LB5/c;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, LR4/O;->e:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, LR4/O;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, LR4/O;->a:LR4/k1;

    .line 9
    .line 10
    iget-object v0, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 11
    .line 12
    invoke-static {v0}, Ly4/b;->v(Lcom/web2native/MainActivity;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v3, LI5/m;

    .line 19
    .line 20
    const/16 v4, 0xa

    .line 21
    .line 22
    invoke-direct {v3, v4}, LI5/m;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, LE3/h;->d(LB5/c;)La6/q;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, LR4/i;->Companion:LR4/h;

    .line 30
    .line 31
    invoke-virtual {v4}, LR4/h;->serializer()LV5/a;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, LC3/a;->A(LV5/a;)LV5/a;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v3, v4, v0}, La6/c;->a(LV5/a;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, LR4/i;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v0, v0, LR4/i;->h:LR4/f;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object v0, v0, LR4/f;->a:Ljava/util/List;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto :goto_3

    .line 56
    :cond_0
    move-object v0, v2

    .line 57
    :goto_0
    iput-object v0, p0, LR4/O;->e:Ljava/util/List;

    .line 58
    .line 59
    :cond_1
    iget-object v0, p0, LR4/O;->e:Ljava/util/List;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    check-cast v0, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, LR4/c;

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    iget-object v3, v3, LR4/c;->a:Ljava/lang/String;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move-object v3, v2

    .line 87
    :goto_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object v0, p0, LR4/O;->e:Ljava/util/List;

    .line 99
    .line 100
    if-eqz v0, :cond_16

    .line 101
    .line 102
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object v0, p0, LR4/O;->a:LR4/k1;

    .line 107
    .line 108
    iget-object v3, v0, LR4/k1;->v:Landroid/widget/RelativeLayout;

    .line 109
    .line 110
    if-eqz v3, :cond_4

    .line 111
    .line 112
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 113
    .line 114
    .line 115
    :cond_4
    iget-object v0, v0, LR4/k1;->u:Landroid/widget/RelativeLayout;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const/4 v3, 0x0

    .line 127
    move v4, v3

    .line 128
    move v5, v4

    .line 129
    :goto_4
    if-ge v5, v0, :cond_16

    .line 130
    .line 131
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    add-int/lit8 v7, v4, 0x1

    .line 138
    .line 139
    if-ltz v4, :cond_15

    .line 140
    .line 141
    check-cast v6, Ljava/lang/String;

    .line 142
    .line 143
    const-string v8, "pattern"

    .line 144
    .line 145
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/16 v8, 0x42

    .line 149
    .line 150
    invoke-static {v6, v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    const-string v8, "compile(...)"

    .line 155
    .line 156
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_14

    .line 168
    .line 169
    iget-object v6, p0, LR4/O;->e:Ljava/util/List;

    .line 170
    .line 171
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    check-cast v6, LR4/c;

    .line 179
    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    iget-object v6, v6, LR4/c;->d:Ljava/lang/String;

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    move-object v6, v2

    .line 186
    :goto_5
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    iget-object v8, p0, LR4/O;->b:Lorg/json/JSONObject;

    .line 191
    .line 192
    const-string v9, "adId"

    .line 193
    .line 194
    invoke-virtual {v8, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const-string v8, "toString(...)"

    .line 203
    .line 204
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget-object v8, p0, LR4/O;->e:Ljava/util/List;

    .line 208
    .line 209
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    check-cast v8, LR4/c;

    .line 217
    .line 218
    if-eqz v8, :cond_7

    .line 219
    .line 220
    iget-object v8, v8, LR4/c;->c:Ljava/lang/String;

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_7
    move-object v8, v2

    .line 224
    :goto_6
    const-string v9, "BANNER"

    .line 225
    .line 226
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_9

    .line 231
    .line 232
    iget-object v8, p0, LR4/O;->e:Ljava/util/List;

    .line 233
    .line 234
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, LR4/c;

    .line 242
    .line 243
    if-eqz v8, :cond_8

    .line 244
    .line 245
    iget-object v8, v8, LR4/c;->e:Ljava/lang/String;

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_8
    move-object v8, v2

    .line 249
    :goto_7
    iput-object v8, p0, LR4/O;->c:Ljava/lang/String;

    .line 250
    .line 251
    :cond_9
    iget-object v8, p0, LR4/O;->e:Ljava/util/List;

    .line 252
    .line 253
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    check-cast v8, LR4/c;

    .line 261
    .line 262
    if-eqz v8, :cond_a

    .line 263
    .line 264
    iget-object v8, v8, LR4/c;->b:Ljava/lang/Integer;

    .line 265
    .line 266
    if-eqz v8, :cond_a

    .line 267
    .line 268
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    goto :goto_8

    .line 273
    :cond_a
    move v8, v3

    .line 274
    :goto_8
    iput v8, p0, LR4/O;->d:I

    .line 275
    .line 276
    new-instance v8, Landroid/os/Handler;

    .line 277
    .line 278
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-direct {v8, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 283
    .line 284
    .line 285
    iget-object v10, p0, LR4/O;->e:Ljava/util/List;

    .line 286
    .line 287
    invoke-static {v10}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    check-cast v4, LR4/c;

    .line 295
    .line 296
    if-eqz v4, :cond_b

    .line 297
    .line 298
    iget-object v4, v4, LR4/c;->c:Ljava/lang/String;

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_b
    move-object v4, v2

    .line 302
    :goto_9
    if-eqz v4, :cond_14

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    const v11, -0x701dbcd1

    .line 309
    .line 310
    .line 311
    const-string v12, "BOTTOM"

    .line 312
    .line 313
    if-eq v10, v11, :cond_11

    .line 314
    .line 315
    const v11, 0x237967bb

    .line 316
    .line 317
    .line 318
    if-eq v10, v11, :cond_e

    .line 319
    .line 320
    const v6, 0x7458732c

    .line 321
    .line 322
    .line 323
    if-eq v10, v6, :cond_c

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_c
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-nez v4, :cond_d

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_d
    iget-object v4, p0, LR4/O;->h:LR4/V;

    .line 334
    .line 335
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_e
    const-string v9, "FULLSCREEN"

    .line 340
    .line 341
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_f

    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_f
    iget-object v4, p0, LR4/O;->c:Ljava/lang/String;

    .line 349
    .line 350
    if-nez v4, :cond_10

    .line 351
    .line 352
    iput-object v12, p0, LR4/O;->c:Ljava/lang/String;

    .line 353
    .line 354
    :cond_10
    new-instance v4, LR4/M;

    .line 355
    .line 356
    const/4 v9, 0x0

    .line 357
    invoke-direct {v4, p0, v6, v9}, LR4/M;-><init>(LR4/O;Ljava/lang/String;I)V

    .line 358
    .line 359
    .line 360
    iget v6, p0, LR4/O;->d:I

    .line 361
    .line 362
    mul-int/lit16 v6, v6, 0x3e8

    .line 363
    .line 364
    int-to-long v9, v6

    .line 365
    invoke-virtual {v8, v4, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 366
    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_11
    const-string v9, "REWARD"

    .line 370
    .line 371
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-nez v4, :cond_12

    .line 376
    .line 377
    goto :goto_a

    .line 378
    :cond_12
    iget-object v4, p0, LR4/O;->c:Ljava/lang/String;

    .line 379
    .line 380
    if-nez v4, :cond_13

    .line 381
    .line 382
    iput-object v12, p0, LR4/O;->c:Ljava/lang/String;

    .line 383
    .line 384
    :cond_13
    new-instance v4, LR4/M;

    .line 385
    .line 386
    const/4 v9, 0x1

    .line 387
    invoke-direct {v4, p0, v6, v9}, LR4/M;-><init>(LR4/O;Ljava/lang/String;I)V

    .line 388
    .line 389
    .line 390
    iget v6, p0, LR4/O;->d:I

    .line 391
    .line 392
    mul-int/lit16 v6, v6, 0x3e8

    .line 393
    .line 394
    int-to-long v9, v6

    .line 395
    invoke-virtual {v8, v4, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 396
    .line 397
    .line 398
    :cond_14
    :goto_a
    move v4, v7

    .line 399
    goto/16 :goto_4

    .line 400
    .line 401
    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 402
    .line 403
    .line 404
    throw v2

    .line 405
    :cond_16
    return-void
.end method
