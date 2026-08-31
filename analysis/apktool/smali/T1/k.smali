.class public final synthetic LT1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LT1/n;


# direct methods
.method public synthetic constructor <init>(LT1/n;I)V
    .locals 0

    .line 1
    iput p2, p0, LT1/k;->q:I

    iput-object p1, p0, LT1/k;->r:LT1/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LT1/k;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    return-object v1

    .line 10
    :pswitch_0
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 11
    .line 12
    iget-object v1, v1, LT1/n;->j:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v2, LJ5/k;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v2, v1, v3}, LJ5/k;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    :goto_0
    return-object v2

    .line 31
    :pswitch_1
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 32
    .line 33
    iget-object v1, v1, LT1/n;->h:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lm5/j;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v1, v1, Lm5/j;->r:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v1, 0x0

    .line 49
    :goto_1
    return-object v1

    .line 50
    :pswitch_2
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 51
    .line 52
    iget-object v1, v1, LT1/n;->h:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lm5/j;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v1, v1, Lm5/j;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/List;

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-object v1

    .line 74
    :pswitch_3
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 75
    .line 76
    iget-object v1, v1, LT1/n;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "parse(...)"

    .line 83
    .line 84
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2, v3}, LT1/n;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v3, Lm5/j;

    .line 127
    .line 128
    invoke-direct {v3, v2, v1}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object v1, v3

    .line 132
    :goto_2
    return-object v1

    .line 133
    :pswitch_4
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 134
    .line 135
    iget-object v2, v1, LT1/n;->a:Ljava/lang/String;

    .line 136
    .line 137
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v4, v1, LT1/n;->e:Lm5/o;

    .line 143
    .line 144
    invoke-virtual {v4}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_5

    .line 155
    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_5
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    const-string v5, "parse(...)"

    .line 163
    .line 164
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_b

    .line 180
    .line 181
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Ljava/lang/String;

    .line 186
    .line 187
    new-instance v7, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v6}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    const/4 v10, 0x1

    .line 201
    if-gt v9, v10, :cond_a

    .line 202
    .line 203
    invoke-static {v8}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Ljava/lang/String;

    .line 208
    .line 209
    if-nez v8, :cond_6

    .line 210
    .line 211
    iput-boolean v10, v1, LT1/n;->g:Z

    .line 212
    .line 213
    move-object v8, v6

    .line 214
    :cond_6
    sget-object v9, LT1/n;->n:LJ5/k;

    .line 215
    .line 216
    invoke-static {v9, v8}, LJ5/k;->a(LJ5/k;Ljava/lang/String;)LB0/G0;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    new-instance v11, LT1/m;

    .line 221
    .line 222
    invoke-direct {v11}, LT1/m;-><init>()V

    .line 223
    .line 224
    .line 225
    const/4 v12, 0x0

    .line 226
    :goto_4
    const-string v13, "quote(...)"

    .line 227
    .line 228
    const-string v14, "substring(...)"

    .line 229
    .line 230
    if-eqz v9, :cond_8

    .line 231
    .line 232
    iget-object v15, v9, LB0/G0;->t:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v15, LJ5/j;

    .line 235
    .line 236
    invoke-virtual {v15, v10}, LJ5/j;->g(I)LJ5/h;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    invoke-static {v15}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object v15, v15, LJ5/h;->a:Ljava/lang/String;

    .line 244
    .line 245
    move/from16 v16, v10

    .line 246
    .line 247
    iget-object v10, v11, LT1/m;->b:Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9}, LB0/G0;->D()LG5/d;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    iget v10, v10, LG5/b;->q:I

    .line 257
    .line 258
    if-le v10, v12, :cond_7

    .line 259
    .line 260
    invoke-virtual {v9}, LB0/G0;->D()LG5/d;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    iget v10, v10, LG5/b;->q:I

    .line 265
    .line 266
    invoke-virtual {v8, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-static {v10, v14}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v10}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-static {v10, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    :cond_7
    const-string v10, "([\\s\\S]+?)?"

    .line 284
    .line 285
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v9}, LB0/G0;->D()LG5/d;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    iget v10, v10, LG5/b;->r:I

    .line 293
    .line 294
    add-int/lit8 v12, v10, 0x1

    .line 295
    .line 296
    invoke-virtual {v9}, LB0/G0;->M()LB0/G0;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    move/from16 v10, v16

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_8
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    if-ge v12, v9, :cond_9

    .line 308
    .line 309
    invoke-virtual {v8, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-static {v8, v14}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v8}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-static {v8, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    :cond_9
    const-string v8, "$"

    .line 327
    .line 328
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    const-string v8, "toString(...)"

    .line 336
    .line 337
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v7}, LT1/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    iput-object v7, v11, LT1/m;->a:Ljava/lang/String;

    .line 345
    .line 346
    invoke-interface {v3, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v3, "Query parameter "

    .line 354
    .line 355
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    const-string v3, " must only be present once in "

    .line 362
    .line 363
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    const-string v2, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v2

    .line 388
    :cond_b
    :goto_5
    return-object v3

    .line 389
    :pswitch_5
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 390
    .line 391
    iget-object v1, v1, LT1/n;->a:Ljava/lang/String;

    .line 392
    .line 393
    if-eqz v1, :cond_c

    .line 394
    .line 395
    sget-object v2, LT1/n;->r:LJ5/k;

    .line 396
    .line 397
    invoke-virtual {v2, v1}, LJ5/k;->c(Ljava/lang/CharSequence;)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_c

    .line 402
    .line 403
    const/4 v1, 0x1

    .line 404
    goto :goto_6

    .line 405
    :cond_c
    const/4 v1, 0x0

    .line 406
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    return-object v1

    .line 411
    :pswitch_6
    iget-object v1, v0, LT1/k;->r:LT1/n;

    .line 412
    .line 413
    iget-object v1, v1, LT1/n;->c:Ljava/lang/String;

    .line 414
    .line 415
    if-eqz v1, :cond_d

    .line 416
    .line 417
    new-instance v2, LJ5/k;

    .line 418
    .line 419
    const/4 v3, 0x0

    .line 420
    invoke-direct {v2, v1, v3}, LJ5/k;-><init>(Ljava/lang/String;I)V

    .line 421
    .line 422
    .line 423
    goto :goto_7

    .line 424
    :cond_d
    const/4 v2, 0x0

    .line 425
    :goto_7
    return-object v2

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
