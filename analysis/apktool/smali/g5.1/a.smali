.class public final synthetic Lg5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# instance fields
.field public final synthetic a:Lg5/c;


# direct methods
.method public synthetic constructor <init>(Lg5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/a;->a:Lg5/c;

    return-void
.end method


# virtual methods
.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    const-string v3, ";"

    .line 6
    .line 7
    move-object/from16 v4, p0

    .line 8
    .line 9
    iget-object v5, v4, Lg5/a;->a:Lg5/c;

    .line 10
    .line 11
    iget-object v6, v5, Lg5/c;->c:Lorg/json/JSONObject;

    .line 12
    .line 13
    const-string v7, "mimeType"

    .line 14
    .line 15
    const-string v8, "contentDisposition"

    .line 16
    .line 17
    const-string v9, "userAgent"

    .line 18
    .line 19
    const-string v10, "url"

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v6, v10, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-object/from16 v0, p2

    .line 25
    .line 26
    invoke-virtual {v6, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p3

    .line 30
    .line 31
    invoke-virtual {v6, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v0, "contentLength"

    .line 38
    .line 39
    move-wide/from16 v11, p5

    .line 40
    .line 41
    invoke-virtual {v6, v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object v11, v5, Lg5/c;->a:LR4/k1;

    .line 50
    .line 51
    iget-object v12, v11, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 52
    .line 53
    iget-object v13, v11, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 54
    .line 55
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 56
    .line 57
    invoke-static {v12, v0}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    if-eqz v14, :cond_1

    .line 62
    .line 63
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v15, 0x1d

    .line 66
    .line 67
    if-ge v14, v15, :cond_1

    .line 68
    .line 69
    iget-object v1, v11, LR4/k1;->S:Lg5/h;

    .line 70
    .line 71
    iget-object v2, v1, Lg5/h;->b:LR4/k1;

    .line 72
    .line 73
    iget v2, v2, LR4/k1;->b0:I

    .line 74
    .line 75
    iget-object v1, v1, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 76
    .line 77
    invoke-static {v1, v0}, Lk1/c;->i(Lcom/web2native/MainActivity;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    filled-new-array {v0}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v1, v0, v2}, Lk1/c;->h(Lh/h;[Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_9

    .line 91
    .line 92
    :cond_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v1, v0, v2}, Lk1/c;->h(Lh/h;[Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_9

    .line 100
    .line 101
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const-string v0, "blob"

    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    invoke-static {v1, v0, v14}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    iget-object v0, v11, LR4/k1;->k:Landroid/webkit/WebView;

    .line 114
    .line 115
    if-eqz v0, :cond_e

    .line 116
    .line 117
    iget-object v3, v11, LR4/k1;->H:LR4/l3;

    .line 118
    .line 119
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v1, v2}, LR4/l3;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_2
    const-string v1, "Downloading File..."

    .line 135
    .line 136
    const-string v0, "getString(...)"

    .line 137
    .line 138
    const-string v2, "/"

    .line 139
    .line 140
    :try_start_1
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-static {v10, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-static {v8, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const/16 p1, 0x1

    .line 163
    .line 164
    invoke-virtual {v0, v10}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v15
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 168
    const-string v14, "."

    .line 169
    .line 170
    const-string v4, "substring(...)"

    .line 171
    .line 172
    if-eqz v7, :cond_3

    .line 173
    .line 174
    :try_start_2
    const-string v0, "application/force-download"

    .line 175
    .line 176
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_3

    .line 181
    .line 182
    const-string v0, "application/octet-stream"

    .line 183
    .line 184
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_3

    .line 189
    .line 190
    const-string v0, "application/vnd.android.package-archive"

    .line 191
    .line 192
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_3

    .line 197
    .line 198
    const-string v0, "application/pdf"

    .line 199
    .line 200
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_4

    .line 205
    .line 206
    :cond_3
    move-object/from16 p4, v7

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    move-object/from16 p5, v1

    .line 210
    .line 211
    move-object/from16 p6, v15

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :catch_1
    move-exception v0

    .line 215
    goto/16 :goto_8

    .line 216
    .line 217
    :goto_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    move-object/from16 p5, v1

    .line 222
    .line 223
    invoke-static {v10}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-eqz v1, :cond_5

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 230
    .line 231
    .line 232
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 233
    if-nez v0, :cond_6

    .line 234
    .line 235
    :cond_5
    move-object/from16 p6, v15

    .line 236
    .line 237
    const/4 v15, 0x6

    .line 238
    goto :goto_2

    .line 239
    :cond_6
    move-object/from16 p6, v15

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :goto_2
    :try_start_3
    invoke-static {v15, v8, v14}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    add-int/lit8 v0, v0, 0x1

    .line 247
    .line 248
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    add-int/lit8 v15, v15, -0x1

    .line 253
    .line 254
    invoke-virtual {v8, v0, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 265
    if-eqz v0, :cond_7

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :catch_2
    move-exception v0

    .line 269
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 270
    .line 271
    .line 272
    :cond_7
    :goto_3
    move-object/from16 v0, p4

    .line 273
    .line 274
    :goto_4
    if-eqz v1, :cond_8

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 277
    .line 278
    .line 279
    move-result v15

    .line 280
    if-lez v15, :cond_8

    .line 281
    .line 282
    invoke-virtual {v7, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    if-eqz v1, :cond_8

    .line 287
    .line 288
    move-object v7, v1

    .line 289
    goto :goto_5

    .line 290
    :cond_8
    move-object v7, v0

    .line 291
    :goto_5
    invoke-static {v10, v8, v7}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iput-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v3}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_9

    .line 305
    .line 306
    iget-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 307
    .line 308
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    const-string v1, ""

    .line 312
    .line 313
    invoke-static {v0, v3, v1}, LJ5/t;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iput-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 318
    .line 319
    :cond_9
    iget-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    const/16 v1, 0x19

    .line 329
    .line 330
    if-le v0, v1, :cond_a

    .line 331
    .line 332
    iget-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 333
    .line 334
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    const/4 v15, 0x6

    .line 338
    invoke-static {v15, v0, v14}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    const/16 v1, 0x15

    .line 343
    .line 344
    if-le v0, v1, :cond_a

    .line 345
    .line 346
    iget-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    iget-object v1, v5, Lg5/c;->d:Ljava/lang/String;

    .line 352
    .line 353
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    const/4 v15, 0x6

    .line 357
    invoke-static {v15, v1, v14}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-object v1, v5, Lg5/c;->d:Ljava/lang/String;

    .line 371
    .line 372
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    iget-object v3, v5, Lg5/c;->d:Ljava/lang/String;

    .line 376
    .line 377
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    const/4 v15, 0x6

    .line 381
    invoke-static {v15, v3, v14}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    add-int/lit8 v3, v3, -0x1

    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    invoke-virtual {v1, v15, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    iget-object v3, v5, Lg5/c;->d:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3, v15, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    new-instance v3, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    iput-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 430
    .line 431
    :cond_a
    const-string v0, "data:"

    .line 432
    .line 433
    const/4 v15, 0x0

    .line 434
    invoke-static {v10, v0, v15}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_b

    .line 439
    .line 440
    const-string v0, "File downloading .."

    .line 441
    .line 442
    move/from16 v1, p1

    .line 443
    .line 444
    invoke-static {v12, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 449
    .line 450
    .line 451
    new-instance v0, LR4/s0;

    .line 452
    .line 453
    invoke-direct {v0, v13, v11, v15}, LR4/s0;-><init>(Lcom/web2native/MainActivity;LR4/k1;I)V

    .line 454
    .line 455
    .line 456
    sget-object v1, LM5/H;->a:LT5/e;

    .line 457
    .line 458
    sget-object v1, LR5/n;->a:LN5/f;

    .line 459
    .line 460
    invoke-static {v1}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    new-instance v2, LR4/m0;

    .line 465
    .line 466
    const/4 v3, 0x0

    .line 467
    invoke-direct {v2, v0, v10, v3}, LR4/m0;-><init>(LR4/s0;Ljava/lang/String;Lq5/c;)V

    .line 468
    .line 469
    .line 470
    const/4 v0, 0x3

    .line 471
    invoke-static {v1, v3, v3, v2, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 472
    .line 473
    .line 474
    const-string v0, "File downloaded in Downloads folder"

    .line 475
    .line 476
    const/4 v1, 0x1

    .line 477
    invoke-static {v13, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_9

    .line 485
    .line 486
    :cond_b
    iget-object v0, v11, LR4/k1;->d:LR4/i;

    .line 487
    .line 488
    if-eqz v0, :cond_c

    .line 489
    .line 490
    iget-object v0, v0, LR4/i;->z:LR4/Y;

    .line 491
    .line 492
    if-eqz v0, :cond_c

    .line 493
    .line 494
    iget-object v0, v0, LR4/Y;->a:Ljava/lang/Boolean;

    .line 495
    .line 496
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 497
    .line 498
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v14

    .line 502
    goto :goto_6

    .line 503
    :cond_c
    move v14, v15

    .line 504
    :goto_6
    if-eqz v14, :cond_d

    .line 505
    .line 506
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    iget-object v1, v5, Lg5/c;->d:Ljava/lang/String;

    .line 519
    .line 520
    new-instance v3, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    goto :goto_7

    .line 539
    :cond_d
    iget-object v0, v5, Lg5/c;->d:Ljava/lang/String;

    .line 540
    .line 541
    :goto_7
    new-instance v1, Landroid/app/DownloadManager$Request;

    .line 542
    .line 543
    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-direct {v1, v2}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v7}, Landroid/app/DownloadManager$Request;->setMimeType(Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const-string v3, "content-disposition"

    .line 555
    .line 556
    invoke-virtual {v2, v3, v8}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const-string v3, "User-Agent"

    .line 561
    .line 562
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    invoke-virtual {v2, v3, v4}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const-string v3, "cookie"

    .line 571
    .line 572
    move-object/from16 v4, p6

    .line 573
    .line 574
    invoke-virtual {v2, v3, v4}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    move-object/from16 v3, p5

    .line 579
    .line 580
    invoke-virtual {v2, v3}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    iget-object v4, v5, Lg5/c;->d:Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {v2, v4}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v2, v4, v0}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    const/4 v2, 0x1

    .line 597
    invoke-virtual {v0, v2}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroid/app/DownloadManager$Request;->allowScanningByMediaScanner()V

    .line 602
    .line 603
    .line 604
    iget-object v0, v5, Lg5/c;->b:Landroid/app/DownloadManager;

    .line 605
    .line 606
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 607
    .line 608
    .line 609
    move-result-wide v0

    .line 610
    iput-wide v0, v5, Lg5/c;->e:J

    .line 611
    .line 612
    invoke-static {v12, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 617
    .line 618
    .line 619
    goto :goto_9

    .line 620
    :goto_8
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 621
    .line 622
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    const-string v0, "Download File Error..."

    .line 626
    .line 627
    const/4 v1, 0x1

    .line 628
    invoke-static {v12, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 633
    .line 634
    .line 635
    :cond_e
    :goto_9
    return-void
.end method
