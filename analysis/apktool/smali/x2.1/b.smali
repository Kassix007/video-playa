.class public final Lx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/g;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:LD2/n;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;LD2/n;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx2/b;->a:I

    iput-object p1, p0, Lx2/b;->b:Landroid/net/Uri;

    iput-object p2, p0, Lx2/b;->c:LD2/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p1, p0, Lx2/b;->a:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lx2/b;->b:Landroid/net/Uri;

    .line 7
    .line 8
    iget-object v4, p0, Lx2/b;->c:LD2/n;

    .line 9
    .line 10
    sget-object v5, Lv2/e;->s:Lv2/e;

    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v6, "Invalid android.resource URI: "

    .line 20
    .line 21
    if-eqz p1, :cond_c

    .line 22
    .line 23
    invoke-static {p1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    :cond_0
    if-eqz v1, :cond_c

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p1, :cond_b

    .line 43
    .line 44
    invoke-static {p1}, LJ5/t;->H0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_b

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v3, v4, LD2/n;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    :goto_0
    new-instance v7, Landroid/util/TypedValue;

    .line 80
    .line 81
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, p1, v7, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 85
    .line 86
    .line 87
    iget-object v7, v7, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 88
    .line 89
    const/16 v8, 0x2f

    .line 90
    .line 91
    const/4 v9, 0x6

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-static {v7, v8, v10, v9}, LJ5/m;->X0(Ljava/lang/CharSequence;CII)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-interface {v7, v8, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-static {v8, v7}, LH2/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    const-string v8, "text/xml"

    .line 118
    .line 119
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_a

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    const-string v7, "Invalid resource ID: "

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-static {v3, p1}, La/a;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    invoke-static {p1, v7}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_3
    invoke-virtual {v6, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    :goto_1
    if-eq v8, v0, :cond_4

    .line 167
    .line 168
    if-eq v8, v2, :cond_4

    .line 169
    .line 170
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    if-ne v8, v0, :cond_9

    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget-object v1, Lm1/l;->a:Ljava/lang/ThreadLocal;

    .line 182
    .line 183
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    :goto_2
    instance-of p1, v0, Landroid/graphics/drawable/VectorDrawable;

    .line 190
    .line 191
    if-nez p1, :cond_6

    .line 192
    .line 193
    instance-of p1, v0, Lr2/o;

    .line 194
    .line 195
    if-eqz p1, :cond_5

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_5
    move v2, v10

    .line 199
    :cond_6
    :goto_3
    new-instance p1, Lx2/d;

    .line 200
    .line 201
    if-eqz v2, :cond_7

    .line 202
    .line 203
    iget-object v1, v4, LD2/n;->b:Landroid/graphics/Bitmap$Config;

    .line 204
    .line 205
    iget-object v6, v4, LD2/n;->d:LE2/h;

    .line 206
    .line 207
    iget-object v7, v4, LD2/n;->e:LE2/g;

    .line 208
    .line 209
    iget-boolean v4, v4, LD2/n;->f:Z

    .line 210
    .line 211
    invoke-static {v0, v1, v6, v7, v4}, Lcom/google/android/gms/internal/measurement/n2;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LE2/h;LE2/g;Z)Landroid/graphics/Bitmap;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 220
    .line 221
    invoke-direct {v3, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v3

    .line 225
    :cond_7
    invoke-direct {p1, v0, v2, v5}, Lx2/d;-><init>(Landroid/graphics/drawable/Drawable;ZLv2/e;)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    invoke-static {p1, v7}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_9
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 244
    .line 245
    const-string v0, "No start tag found."

    .line 246
    .line 247
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw p1

    .line 251
    :cond_a
    new-instance v0, Landroid/util/TypedValue;

    .line 252
    .line 253
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    new-instance v1, Lx2/m;

    .line 261
    .line 262
    invoke-static {p1}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    new-instance v2, Lv2/l;

    .line 271
    .line 272
    iget v0, v0, Landroid/util/TypedValue;->density:I

    .line 273
    .line 274
    invoke-direct {v2, v0}, Lv2/l;-><init>(I)V

    .line 275
    .line 276
    .line 277
    new-instance v0, Lv2/m;

    .line 278
    .line 279
    invoke-direct {v0, p1, v2}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v1, v0, v7, v5}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 283
    .line 284
    .line 285
    move-object p1, v1

    .line 286
    :goto_4
    return-object p1

    .line 287
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 288
    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p1

    .line 305
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 306
    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw p1

    .line 323
    :pswitch_0
    iget-object p1, v4, LD2/n;->a:Landroid/content/Context;

    .line 324
    .line 325
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    const-string v7, "com.android.contacts"

    .line 334
    .line 335
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    const-string v7, "\'."

    .line 340
    .line 341
    if-eqz v6, :cond_f

    .line 342
    .line 343
    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    const-string v8, "display_photo"

    .line 348
    .line 349
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    if-eqz v6, :cond_f

    .line 354
    .line 355
    const-string v0, "r"

    .line 356
    .line 357
    invoke-virtual {p1, v3, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    if-eqz v0, :cond_d

    .line 362
    .line 363
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    :cond_d
    if-eqz v1, :cond_e

    .line 368
    .line 369
    goto/16 :goto_9

    .line 370
    .line 371
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v0, "Unable to find a contact photo associated with \'"

    .line 374
    .line 375
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0

    .line 398
    :cond_f
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 399
    .line 400
    const/16 v8, 0x1d

    .line 401
    .line 402
    if-lt v6, v8, :cond_16

    .line 403
    .line 404
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    const-string v8, "media"

    .line 409
    .line 410
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    if-nez v6, :cond_10

    .line 415
    .line 416
    goto/16 :goto_8

    .line 417
    .line 418
    :cond_10
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    const/4 v9, 0x3

    .line 427
    if-lt v8, v9, :cond_16

    .line 428
    .line 429
    add-int/lit8 v9, v8, -0x3

    .line 430
    .line 431
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    const-string v10, "audio"

    .line 436
    .line 437
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-eqz v9, :cond_16

    .line 442
    .line 443
    sub-int/2addr v8, v0

    .line 444
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    const-string v6, "albums"

    .line 449
    .line 450
    invoke-static {v0, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-eqz v0, :cond_16

    .line 455
    .line 456
    iget-object v0, v4, LD2/n;->d:LE2/h;

    .line 457
    .line 458
    iget-object v4, v0, LE2/h;->a:LC3/a;

    .line 459
    .line 460
    instance-of v6, v4, LE2/a;

    .line 461
    .line 462
    if-eqz v6, :cond_11

    .line 463
    .line 464
    check-cast v4, LE2/a;

    .line 465
    .line 466
    goto :goto_5

    .line 467
    :cond_11
    move-object v4, v1

    .line 468
    :goto_5
    if-eqz v4, :cond_13

    .line 469
    .line 470
    iget v4, v4, LE2/a;->t:I

    .line 471
    .line 472
    iget-object v0, v0, LE2/h;->b:LC3/a;

    .line 473
    .line 474
    instance-of v6, v0, LE2/a;

    .line 475
    .line 476
    if-eqz v6, :cond_12

    .line 477
    .line 478
    check-cast v0, LE2/a;

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_12
    move-object v0, v1

    .line 482
    :goto_6
    if-eqz v0, :cond_13

    .line 483
    .line 484
    iget v0, v0, LE2/a;->t:I

    .line 485
    .line 486
    new-instance v6, Landroid/os/Bundle;

    .line 487
    .line 488
    invoke-direct {v6, v2}, Landroid/os/Bundle;-><init>(I)V

    .line 489
    .line 490
    .line 491
    new-instance v2, Landroid/graphics/Point;

    .line 492
    .line 493
    invoke-direct {v2, v4, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 494
    .line 495
    .line 496
    const-string v0, "android.content.extra.SIZE"

    .line 497
    .line 498
    invoke-virtual {v6, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 499
    .line 500
    .line 501
    goto :goto_7

    .line 502
    :cond_13
    move-object v6, v1

    .line 503
    :goto_7
    invoke-static {p1, v3, v6}, Lt1/a;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-eqz v0, :cond_14

    .line 508
    .line 509
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    :cond_14
    if-eqz v1, :cond_15

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v0, "Unable to find a music thumbnail associated with \'"

    .line 519
    .line 520
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object p1

    .line 533
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 534
    .line 535
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v0

    .line 543
    :cond_16
    :goto_8
    invoke-virtual {p1, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    if-eqz v1, :cond_17

    .line 548
    .line 549
    :goto_9
    new-instance v0, Lx2/m;

    .line 550
    .line 551
    invoke-static {v1}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-static {v1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    new-instance v2, Lv2/a;

    .line 560
    .line 561
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 562
    .line 563
    .line 564
    new-instance v4, Lv2/m;

    .line 565
    .line 566
    invoke-direct {v4, v1, v2}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {p1, v3}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    invoke-direct {v0, v4, p1, v5}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 574
    .line 575
    .line 576
    return-object v0

    .line 577
    :cond_17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    const-string v0, "Unable to open \'"

    .line 580
    .line 581
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 595
    .line 596
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v0

    .line 604
    :pswitch_1
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    check-cast p1, Ljava/lang/Iterable;

    .line 609
    .line 610
    invoke-static {p1}, Ln5/l;->i0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object p1

    .line 614
    move-object v6, p1

    .line 615
    check-cast v6, Ljava/lang/Iterable;

    .line 616
    .line 617
    const/4 v10, 0x0

    .line 618
    const/16 v11, 0x3e

    .line 619
    .line 620
    const-string v7, "/"

    .line 621
    .line 622
    const/4 v8, 0x0

    .line 623
    const/4 v9, 0x0

    .line 624
    invoke-static/range {v6 .. v11}, Ln5/l;->q0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;LB5/c;I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    new-instance v0, Lx2/m;

    .line 629
    .line 630
    iget-object v1, v4, LD2/n;->a:Landroid/content/Context;

    .line 631
    .line 632
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-static {v1}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    invoke-static {v1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    new-instance v2, Lv2/a;

    .line 649
    .line 650
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 651
    .line 652
    .line 653
    new-instance v3, Lv2/m;

    .line 654
    .line 655
    invoke-direct {v3, v1, v2}, Lv2/m;-><init>(Lq6/i;La/a;)V

    .line 656
    .line 657
    .line 658
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-static {v1, p1}, LH2/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    invoke-direct {v0, v3, p1, v5}, Lx2/m;-><init>(Ld6/w;Ljava/lang/String;Lv2/e;)V

    .line 667
    .line 668
    .line 669
    return-object v0

    .line 670
    nop

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
