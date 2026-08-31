.class public final synthetic Lg5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lg5/h;


# direct methods
.method public synthetic constructor <init>(Lg5/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg5/e;->q:I

    iput-object p1, p0, Lg5/e;->r:Lg5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lg5/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    const-string v1, "ALLOWED"

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, v0, Lg5/h;->b:LR4/k1;

    .line 27
    .line 28
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 29
    .line 30
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    const-string v1, "NOT_ALLOWED"

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-boolean v1, v0, Lg5/h;->u:Z

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object p1, v0, Lg5/h;->t:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lg5/h;->d(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const-string v1, "PERMANENTLY_BLOCKED"

    .line 63
    .line 64
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_0
    return-void

    .line 68
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 74
    .line 75
    iget-object p1, p1, Lg5/h;->b:LR4/k1;

    .line 76
    .line 77
    iget-object p1, p1, LR4/k1;->G:LR4/V;

    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    check-cast p1, Le/a;

    .line 81
    .line 82
    const-string v0, "it"

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 88
    .line 89
    iget-object v0, p1, Lg5/h;->b:LR4/k1;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, Lg5/h;->v:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v0, p1, Lg5/h;->t:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lg5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void

    .line 104
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 110
    .line 111
    iget-object p1, p1, Lg5/h;->b:LR4/k1;

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    iput-boolean v0, p1, LR4/k1;->W:Z

    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    const-string v1, "ALLOWED"

    .line 132
    .line 133
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    iget-object p1, v0, Lg5/h;->b:LR4/k1;

    .line 138
    .line 139
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 140
    .line 141
    const-string v1, "android.permission.READ_CONTACTS"

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 150
    .line 151
    if-eqz p1, :cond_8

    .line 152
    .line 153
    const-string v1, "NOT_ALLOWED"

    .line 154
    .line 155
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 160
    .line 161
    if-eqz p1, :cond_8

    .line 162
    .line 163
    iget-boolean v1, v0, Lg5/h;->u:Z

    .line 164
    .line 165
    if-eqz v1, :cond_7

    .line 166
    .line 167
    iget-object p1, v0, Lg5/h;->t:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Lg5/h;->d(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_7
    const-string v1, "PERMANENTLY_BLOCKED"

    .line 174
    .line 175
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    :goto_1
    return-void

    .line 179
    :pswitch_4
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 180
    .line 181
    iget-object v1, v0, Lg5/h;->b:LR4/k1;

    .line 182
    .line 183
    check-cast p1, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_b

    .line 190
    .line 191
    iget-boolean p1, v0, Lg5/h;->e:Z

    .line 192
    .line 193
    iget-object v1, v0, Lg5/h;->h:Le/g;

    .line 194
    .line 195
    if-nez p1, :cond_a

    .line 196
    .line 197
    iget-object p1, v0, Lg5/h;->p:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz p1, :cond_9

    .line 200
    .line 201
    invoke-virtual {v1, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_9
    const-string p1, ""

    .line 206
    .line 207
    invoke-virtual {v1, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_a
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz p1, :cond_10

    .line 214
    .line 215
    const-string v1, "ALLOWED"

    .line 216
    .line 217
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_b
    iget-object p1, v1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 222
    .line 223
    const-string v2, "android.permission.CAMERA"

    .line 224
    .line 225
    invoke-virtual {p1, v2}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_c

    .line 230
    .line 231
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 232
    .line 233
    if-eqz p1, :cond_e

    .line 234
    .line 235
    const-string v2, "NOT_ALLOWED"

    .line 236
    .line 237
    invoke-virtual {v0, p1, v2}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_c
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 242
    .line 243
    if-eqz p1, :cond_e

    .line 244
    .line 245
    iget-boolean v2, v0, Lg5/h;->u:Z

    .line 246
    .line 247
    if-eqz v2, :cond_d

    .line 248
    .line 249
    iget-object p1, v0, Lg5/h;->t:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v0, p1}, Lg5/h;->d(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_d
    const-string v2, "PERMANENTLY_BLOCKED"

    .line 256
    .line 257
    invoke-virtual {v0, p1, v2}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_e
    :goto_2
    iget-object p1, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 261
    .line 262
    if-eqz p1, :cond_f

    .line 263
    .line 264
    const/4 v0, 0x0

    .line 265
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_f
    iget-object p1, v1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 269
    .line 270
    const-string v0, "Please allow camera permission for capturing"

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 278
    .line 279
    .line 280
    :cond_10
    :goto_3
    return-void

    .line 281
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 282
    .line 283
    const-string v0, "result"

    .line 284
    .line 285
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    check-cast p1, Ljava/util/Collection;

    .line 289
    .line 290
    const/4 v0, 0x0

    .line 291
    new-array v0, v0, [Landroid/net/Uri;

    .line 292
    .line 293
    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    check-cast p1, [Landroid/net/Uri;

    .line 298
    .line 299
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 300
    .line 301
    iget-object v0, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 302
    .line 303
    if-eqz v0, :cond_11

    .line 304
    .line 305
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_11
    return-void

    .line 309
    :pswitch_6
    check-cast p1, Landroid/net/Uri;

    .line 310
    .line 311
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 312
    .line 313
    if-eqz p1, :cond_12

    .line 314
    .line 315
    iget-object v0, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 316
    .line 317
    if-eqz v0, :cond_13

    .line 318
    .line 319
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_12
    iget-object p1, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 328
    .line 329
    if-eqz p1, :cond_13

    .line 330
    .line 331
    const/4 v0, 0x0

    .line 332
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_13
    :goto_4
    return-void

    .line 336
    :pswitch_7
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 337
    .line 338
    check-cast p1, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-eqz p1, :cond_15

    .line 345
    .line 346
    :try_start_0
    iget-object p1, v0, Lg5/h;->i:Le/g;

    .line 347
    .line 348
    const-string v1, "audio"

    .line 349
    .line 350
    invoke-virtual {p1, v1}, Le/g;->u(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :catch_0
    iget-object p1, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 355
    .line 356
    if-eqz p1, :cond_14

    .line 357
    .line 358
    const/4 v1, 0x0

    .line 359
    invoke-interface {p1, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_14
    iget-object p1, v0, Lg5/h;->b:LR4/k1;

    .line 363
    .line 364
    iget-object p1, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 365
    .line 366
    const-string v0, "No voice recorder application found on device."

    .line 367
    .line 368
    const/4 v1, 0x1

    .line 369
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 374
    .line 375
    .line 376
    :cond_15
    :goto_5
    return-void

    .line 377
    :pswitch_8
    check-cast p1, Landroid/net/Uri;

    .line 378
    .line 379
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 380
    .line 381
    if-eqz p1, :cond_16

    .line 382
    .line 383
    iget-object v0, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 384
    .line 385
    if-eqz v0, :cond_17

    .line 386
    .line 387
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_16
    iget-object p1, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 396
    .line 397
    if-eqz p1, :cond_17

    .line 398
    .line 399
    const/4 v0, 0x0

    .line 400
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_17
    :goto_6
    return-void

    .line 404
    :pswitch_9
    check-cast p1, Landroid/net/Uri;

    .line 405
    .line 406
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 407
    .line 408
    if-eqz p1, :cond_18

    .line 409
    .line 410
    iget-object v0, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 411
    .line 412
    if-eqz v0, :cond_19

    .line 413
    .line 414
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_18
    iget-object p1, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 423
    .line 424
    if-eqz p1, :cond_19

    .line 425
    .line 426
    const/4 v0, 0x0

    .line 427
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_19
    :goto_7
    return-void

    .line 431
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 437
    .line 438
    iget-object v0, p1, Lg5/h;->b:LR4/k1;

    .line 439
    .line 440
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 441
    .line 442
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-nez v1, :cond_1a

    .line 447
    .line 448
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 449
    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_1a
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    iget-object v2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 457
    .line 458
    iget-object v1, v1, LO3/Y;->e:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v1, LR4/V;

    .line 461
    .line 462
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v2}, LR4/V;->h(Landroid/content/Context;)Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-nez v1, :cond_1b

    .line 470
    .line 471
    invoke-virtual {p1}, Lg5/h;->e()V

    .line 472
    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_1b
    invoke-static {v2}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    if-eqz p1, :cond_1c

    .line 480
    .line 481
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    iget-object p1, p1, LO3/Y;->d:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast p1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 488
    .line 489
    if-eqz p1, :cond_1c

    .line 490
    .line 491
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    iget-object p1, p1, LO3/Y;->d:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast p1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 498
    .line 499
    if-eqz p1, :cond_1c

    .line 500
    .line 501
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    iget-object v0, v0, LO3/Y;->c:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Ljava/lang/String;

    .line 508
    .line 509
    const/4 v1, 0x1

    .line 510
    const/4 v2, 0x0

    .line 511
    invoke-interface {p1, v0, v1, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 512
    .line 513
    .line 514
    :cond_1c
    :goto_8
    return-void

    .line 515
    :pswitch_b
    check-cast p1, Ljava/util/Map;

    .line 516
    .line 517
    const-string v0, "isGranted"

    .line 518
    .line 519
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 523
    .line 524
    iget-object v0, p1, Lg5/h;->b:LR4/k1;

    .line 525
    .line 526
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iget-object v2, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 531
    .line 532
    iget-object v1, v1, LO3/Y;->e:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v1, LR4/V;

    .line 535
    .line 536
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 540
    .line 541
    invoke-static {v1}, LR4/V;->h(Landroid/content/Context;)Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    const/4 v4, 0x0

    .line 546
    if-eqz v3, :cond_1f

    .line 547
    .line 548
    iget-object v2, p1, Lg5/h;->v:Ljava/lang/String;

    .line 549
    .line 550
    if-eqz v2, :cond_1d

    .line 551
    .line 552
    const-string v3, "ALLOWED"

    .line 553
    .line 554
    invoke-virtual {p1, v2, v3}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    :cond_1d
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 558
    .line 559
    .line 560
    move-result p1

    .line 561
    if-eqz p1, :cond_1e

    .line 562
    .line 563
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    iget-object p1, p1, LO3/Y;->d:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast p1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 570
    .line 571
    if-eqz p1, :cond_1e

    .line 572
    .line 573
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    iget-object p1, p1, LO3/Y;->d:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast p1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 580
    .line 581
    if-eqz p1, :cond_26

    .line 582
    .line 583
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    iget-object v0, v0, LO3/Y;->c:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, Ljava/lang/String;

    .line 590
    .line 591
    const/4 v1, 0x1

    .line 592
    invoke-interface {p1, v0, v1, v4}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_c

    .line 596
    .line 597
    :cond_1e
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 598
    .line 599
    .line 600
    move-result p1

    .line 601
    if-nez p1, :cond_26

    .line 602
    .line 603
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 604
    .line 605
    .line 606
    goto/16 :goto_c

    .line 607
    .line 608
    :cond_1f
    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    .line 609
    .line 610
    invoke-virtual {v2, v3}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    if-nez v3, :cond_22

    .line 615
    .line 616
    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    .line 617
    .line 618
    invoke-virtual {v2, v3}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-eqz v2, :cond_20

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_20
    iget-object v2, p1, Lg5/h;->v:Ljava/lang/String;

    .line 626
    .line 627
    if-eqz v2, :cond_23

    .line 628
    .line 629
    iget-boolean v3, p1, Lg5/h;->u:Z

    .line 630
    .line 631
    if-eqz v3, :cond_21

    .line 632
    .line 633
    iget-object v2, p1, Lg5/h;->t:Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {p1, v2}, Lg5/h;->d(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    goto :goto_a

    .line 639
    :cond_21
    const-string v3, "PERMANENTLY_BLOCKED"

    .line 640
    .line 641
    invoke-virtual {p1, v2, v3}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_22
    :goto_9
    iget-object v2, p1, Lg5/h;->v:Ljava/lang/String;

    .line 646
    .line 647
    if-eqz v2, :cond_23

    .line 648
    .line 649
    const-string v3, "NOT_ALLOWED"

    .line 650
    .line 651
    invoke-virtual {p1, v2, v3}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    :cond_23
    :goto_a
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 659
    .line 660
    .line 661
    move-result-wide v2

    .line 662
    iput-wide v2, p1, LO3/Y;->b:J

    .line 663
    .line 664
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 665
    .line 666
    .line 667
    move-result p1

    .line 668
    if-nez p1, :cond_24

    .line 669
    .line 670
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 671
    .line 672
    .line 673
    goto :goto_b

    .line 674
    :cond_24
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 675
    .line 676
    .line 677
    move-result p1

    .line 678
    if-eqz p1, :cond_25

    .line 679
    .line 680
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    iget-object p1, p1, LO3/Y;->e:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast p1, LR4/V;

    .line 687
    .line 688
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    invoke-static {v1}, LR4/V;->h(Landroid/content/Context;)Z

    .line 692
    .line 693
    .line 694
    move-result p1

    .line 695
    if-nez p1, :cond_25

    .line 696
    .line 697
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 698
    .line 699
    .line 700
    move-result-object p1

    .line 701
    iget-object p1, p1, LO3/Y;->d:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast p1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 704
    .line 705
    if-eqz p1, :cond_25

    .line 706
    .line 707
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    iget-object v0, v0, LO3/Y;->c:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, Ljava/lang/String;

    .line 714
    .line 715
    invoke-interface {p1, v0, v4, v4}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 716
    .line 717
    .line 718
    :cond_25
    :goto_b
    const-string p1, "Please accept location permission for better experience"

    .line 719
    .line 720
    invoke-static {v1, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 725
    .line 726
    .line 727
    :cond_26
    :goto_c
    return-void

    .line 728
    :pswitch_c
    check-cast p1, Ljava/util/Map;

    .line 729
    .line 730
    const-string v0, "permissions"

    .line 731
    .line 732
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    iget-object v1, p0, Lg5/e;->r:Lg5/h;

    .line 740
    .line 741
    if-eqz v0, :cond_27

    .line 742
    .line 743
    goto :goto_d

    .line 744
    :cond_27
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 745
    .line 746
    .line 747
    move-result-object p1

    .line 748
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    :cond_28
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    if-eqz v0, :cond_29

    .line 757
    .line 758
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    check-cast v0, Ljava/util/Map$Entry;

    .line 763
    .line 764
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, Ljava/lang/Boolean;

    .line 769
    .line 770
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 771
    .line 772
    .line 773
    move-result v0

    .line 774
    if-nez v0, :cond_28

    .line 775
    .line 776
    iget-object p1, v1, Lg5/h;->b:LR4/k1;

    .line 777
    .line 778
    iget-object p1, p1, LR4/k1;->i0:LR4/V;

    .line 779
    .line 780
    goto :goto_e

    .line 781
    :cond_29
    :goto_d
    iget-object p1, v1, Lg5/h;->b:LR4/k1;

    .line 782
    .line 783
    iget-object p1, p1, LR4/k1;->i0:LR4/V;

    .line 784
    .line 785
    :goto_e
    return-void

    .line 786
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 787
    .line 788
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 789
    .line 790
    .line 791
    move-result p1

    .line 792
    iget-object v0, p0, Lg5/e;->r:Lg5/h;

    .line 793
    .line 794
    if-eqz p1, :cond_2a

    .line 795
    .line 796
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 797
    .line 798
    if-eqz p1, :cond_2d

    .line 799
    .line 800
    const-string v1, "ALLOWED"

    .line 801
    .line 802
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    goto :goto_f

    .line 806
    :cond_2a
    iget-object p1, v0, Lg5/h;->b:LR4/k1;

    .line 807
    .line 808
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 809
    .line 810
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 811
    .line 812
    invoke-virtual {p1, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 813
    .line 814
    .line 815
    move-result p1

    .line 816
    if-eqz p1, :cond_2b

    .line 817
    .line 818
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 819
    .line 820
    if-eqz p1, :cond_2d

    .line 821
    .line 822
    const-string v1, "NOT_ALLOWED"

    .line 823
    .line 824
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    goto :goto_f

    .line 828
    :cond_2b
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 829
    .line 830
    if-eqz p1, :cond_2d

    .line 831
    .line 832
    iget-boolean v1, v0, Lg5/h;->u:Z

    .line 833
    .line 834
    if-eqz v1, :cond_2c

    .line 835
    .line 836
    iget-object p1, v0, Lg5/h;->t:Ljava/lang/String;

    .line 837
    .line 838
    invoke-virtual {v0, p1}, Lg5/h;->d(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    goto :goto_f

    .line 842
    :cond_2c
    const-string v1, "PERMANENTLY_BLOCKED"

    .line 843
    .line 844
    invoke-virtual {v0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    :cond_2d
    :goto_f
    return-void

    .line 848
    :pswitch_e
    check-cast p1, Ljava/util/Map;

    .line 849
    .line 850
    const-string v0, "isGranted"

    .line 851
    .line 852
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    iget-object p1, p0, Lg5/e;->r:Lg5/h;

    .line 856
    .line 857
    iget-object v0, p1, Lg5/h;->v:Ljava/lang/String;

    .line 858
    .line 859
    if-eqz v0, :cond_2f

    .line 860
    .line 861
    iget-boolean v1, p1, Lg5/h;->u:Z

    .line 862
    .line 863
    if-eqz v1, :cond_2e

    .line 864
    .line 865
    iget-object v0, p1, Lg5/h;->t:Ljava/lang/String;

    .line 866
    .line 867
    invoke-virtual {p1, v0}, Lg5/h;->d(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    goto :goto_10

    .line 871
    :cond_2e
    iget-object v1, p1, Lg5/h;->t:Ljava/lang/String;

    .line 872
    .line 873
    invoke-virtual {p1, v1}, Lg5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    invoke-virtual {p1, v0, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    :cond_2f
    :goto_10
    return-void

    .line 881
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
