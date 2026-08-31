.class public abstract LE4/a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LE4/a;->c:I

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE4/a;->c:I

    .line 2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 3
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public I(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget v0, p0, LE4/a;->c:I

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 1
    iget v0, p0, LE4/a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const v4, 0xffffff

    .line 7
    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string v0, "Parcel data not fully consumed, unread size: "

    .line 14
    .line 15
    if-le p1, v4, :cond_0

    .line 16
    .line 17
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    :goto_0
    move v3, v5

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    move-object p3, p0

    .line 33
    check-cast p3, Ly4/g;

    .line 34
    .line 35
    if-eq p1, v1, :cond_5

    .line 36
    .line 37
    const/4 p4, 0x3

    .line 38
    if-eq p1, p4, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 42
    .line 43
    sget p4, Lz4/d;->a:I

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    if-nez p4, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    move-object v2, p1

    .line 57
    check-cast v2, Landroid/os/Parcelable;

    .line 58
    .line 59
    :goto_1
    check-cast v2, Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-gtz p1, :cond_4

    .line 66
    .line 67
    invoke-interface {p3, v2}, Lz4/h;->a(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    new-instance p2, Landroid/os/BadParcelableException;

    .line 72
    .line 73
    invoke-static {p1, v0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p2

    .line 81
    :cond_5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 82
    .line 83
    sget p4, Lz4/d;->a:I

    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-nez p4, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, Landroid/os/Parcelable;

    .line 98
    .line 99
    :goto_2
    check-cast v2, Landroid/os/Bundle;

    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-gtz p1, :cond_7

    .line 106
    .line 107
    invoke-interface {p3, v2}, Lz4/h;->f(Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    return v3

    .line 112
    :cond_7
    new-instance p2, Landroid/os/BadParcelableException;

    .line 113
    .line 114
    invoke-static {p1, v0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p2, p1}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2

    .line 122
    :pswitch_0
    if-le p1, v4, :cond_8

    .line 123
    .line 124
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move p3, v3

    .line 137
    :goto_4
    if-eqz p3, :cond_9

    .line 138
    .line 139
    :goto_5
    move v3, v5

    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :cond_9
    move-object p3, p0

    .line 143
    check-cast p3, Lcom/google/android/gms/internal/clearcut/y0;

    .line 144
    .line 145
    packed-switch p1, :pswitch_data_1

    .line 146
    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 151
    .line 152
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 157
    .line 158
    sget-object p1, Lt3/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 159
    .line 160
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Lt3/b;

    .line 165
    .line 166
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 167
    .line 168
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 173
    .line 174
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 179
    .line 180
    sget-object p1, Lt3/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 181
    .line 182
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Lt3/b;

    .line 187
    .line 188
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 189
    .line 190
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 195
    .line 196
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    .line 201
    .line 202
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 203
    .line 204
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 205
    .line 206
    .line 207
    throw p1

    .line 208
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    .line 210
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 215
    .line 216
    sget-object p1, Lt3/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 217
    .line 218
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, [Lt3/c;

    .line 223
    .line 224
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 225
    .line 226
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 231
    .line 232
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 237
    .line 238
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 239
    .line 240
    .line 241
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 242
    .line 243
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 248
    .line 249
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 254
    .line 255
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 256
    .line 257
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 262
    .line 263
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 268
    .line 269
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 270
    .line 271
    .line 272
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 273
    .line 274
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 275
    .line 276
    .line 277
    throw p1

    .line 278
    :pswitch_8
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 279
    .line 280
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 285
    .line 286
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 287
    .line 288
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 289
    .line 290
    .line 291
    throw p1

    .line 292
    :pswitch_9
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 293
    .line 294
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/clearcut/r;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 299
    .line 300
    iget-object p2, p3, Lcom/google/android/gms/internal/clearcut/y0;->d:Lcom/google/android/gms/internal/clearcut/v0;

    .line 301
    .line 302
    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->A0(Lu3/h;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_5

    .line 306
    .line 307
    :goto_6
    return v3

    .line 308
    :pswitch_a
    if-le p1, v4, :cond_a

    .line 309
    .line 310
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 311
    .line 312
    .line 313
    move-result p4

    .line 314
    if-eqz p4, :cond_b

    .line 315
    .line 316
    :goto_7
    move v3, v5

    .line 317
    goto/16 :goto_9

    .line 318
    .line 319
    :cond_a
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p4

    .line 323
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :cond_b
    packed-switch p1, :pswitch_data_2

    .line 327
    .line 328
    .line 329
    :pswitch_b
    goto :goto_9

    .line 330
    :pswitch_c
    sget-object p1, LR3/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 331
    .line 332
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    check-cast p1, LR3/d;

    .line 337
    .line 338
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 339
    .line 340
    .line 341
    goto :goto_8

    .line 342
    :pswitch_d
    sget-object p1, LR3/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 343
    .line 344
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    check-cast p1, LR3/e;

    .line 349
    .line 350
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 351
    .line 352
    .line 353
    move-object p2, p0

    .line 354
    check-cast p2, Lv3/x;

    .line 355
    .line 356
    new-instance p4, Lv3/q;

    .line 357
    .line 358
    invoke-direct {p4, p2, p1, v5}, Lv3/q;-><init>(Ljava/lang/Object;Ly3/a;I)V

    .line 359
    .line 360
    .line 361
    iget-object p1, p2, Lv3/x;->e:Landroid/os/Handler;

    .line 362
    .line 363
    invoke-virtual {p1, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_8

    .line 367
    :pswitch_e
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 368
    .line 369
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 374
    .line 375
    sget-object p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 376
    .line 377
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 382
    .line 383
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :pswitch_f
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 388
    .line 389
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 394
    .line 395
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 396
    .line 397
    .line 398
    goto :goto_8

    .line 399
    :pswitch_10
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 400
    .line 401
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 406
    .line 407
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 408
    .line 409
    .line 410
    goto :goto_8

    .line 411
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/common/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 412
    .line 413
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    check-cast p1, Lcom/google/android/gms/common/b;

    .line 418
    .line 419
    sget-object p1, LR3/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 420
    .line 421
    invoke-static {p2, p1}, LI3/b;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    check-cast p1, LR3/b;

    .line 426
    .line 427
    invoke-static {p2}, LI3/b;->b(Landroid/os/Parcel;)V

    .line 428
    .line 429
    .line 430
    :goto_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 431
    .line 432
    .line 433
    goto :goto_7

    .line 434
    :goto_9
    return v3

    .line 435
    :pswitch_12
    if-le p1, v4, :cond_c

    .line 436
    .line 437
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 438
    .line 439
    .line 440
    move-result p4

    .line 441
    if-eqz p4, :cond_d

    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_c
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p4

    .line 448
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    :cond_d
    invoke-virtual {p0, p1, p2, p3}, LE4/a;->I(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    :goto_a
    return v5

    .line 456
    :pswitch_13
    if-le p1, v4, :cond_e

    .line 457
    .line 458
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 459
    .line 460
    .line 461
    move-result p3

    .line 462
    if-eqz p3, :cond_f

    .line 463
    .line 464
    :goto_b
    move v3, v5

    .line 465
    goto/16 :goto_f

    .line 466
    .line 467
    :cond_e
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p3

    .line 471
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    :cond_f
    move-object p3, p0

    .line 475
    check-cast p3, LD4/e;

    .line 476
    .line 477
    if-ne p1, v1, :cond_14

    .line 478
    .line 479
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 480
    .line 481
    sget p4, LE4/b;->a:I

    .line 482
    .line 483
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 484
    .line 485
    .line 486
    move-result p4

    .line 487
    if-nez p4, :cond_10

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_10
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    move-object v2, p1

    .line 495
    check-cast v2, Landroid/os/Parcelable;

    .line 496
    .line 497
    :goto_c
    check-cast v2, Landroid/os/Bundle;

    .line 498
    .line 499
    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    .line 500
    .line 501
    .line 502
    move-result p1

    .line 503
    if-gtz p1, :cond_13

    .line 504
    .line 505
    iget-object p1, p3, LD4/e;->f:LD4/f;

    .line 506
    .line 507
    iget-object p1, p1, LD4/f;->a:LE4/k;

    .line 508
    .line 509
    if-eqz p1, :cond_12

    .line 510
    .line 511
    iget-object p2, p3, LD4/e;->e:LS3/e;

    .line 512
    .line 513
    iget-object p4, p1, LE4/k;->f:Ljava/lang/Object;

    .line 514
    .line 515
    monitor-enter p4

    .line 516
    :try_start_0
    iget-object v0, p1, LE4/k;->e:Ljava/util/HashSet;

    .line 517
    .line 518
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 522
    iget-object p2, p1, LE4/k;->f:Ljava/lang/Object;

    .line 523
    .line 524
    monitor-enter p2

    .line 525
    :try_start_1
    iget-object p4, p1, LE4/k;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 526
    .line 527
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 528
    .line 529
    .line 530
    move-result p4

    .line 531
    if-lez p4, :cond_11

    .line 532
    .line 533
    iget-object p4, p1, LE4/k;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 534
    .line 535
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 536
    .line 537
    .line 538
    move-result p4

    .line 539
    if-lez p4, :cond_11

    .line 540
    .line 541
    iget-object p1, p1, LE4/k;->b:LE4/f;

    .line 542
    .line 543
    const-string p4, "Leaving the connection open for other ongoing calls."

    .line 544
    .line 545
    new-array v0, v3, [Ljava/lang/Object;

    .line 546
    .line 547
    invoke-virtual {p1, p4, v0}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    monitor-exit p2

    .line 551
    goto :goto_e

    .line 552
    :catchall_0
    move-exception p1

    .line 553
    goto :goto_d

    .line 554
    :cond_11
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 555
    new-instance p2, LE4/i;

    .line 556
    .line 557
    invoke-direct {p2, v3, p1}, LE4/i;-><init>(ILjava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1}, LE4/k;->a()Landroid/os/Handler;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 565
    .line 566
    .line 567
    goto :goto_e

    .line 568
    :goto_d
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 569
    throw p1

    .line 570
    :catchall_1
    move-exception p1

    .line 571
    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 572
    throw p1

    .line 573
    :cond_12
    :goto_e
    iget-object p1, p3, LD4/e;->d:LE4/f;

    .line 574
    .line 575
    const-string p2, "onGetLaunchReviewFlowInfo"

    .line 576
    .line 577
    new-array p4, v3, [Ljava/lang/Object;

    .line 578
    .line 579
    invoke-virtual {p1, p2, p4}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    const-string p1, "confirmation_intent"

    .line 583
    .line 584
    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    check-cast p1, Landroid/app/PendingIntent;

    .line 589
    .line 590
    const-string p2, "is_review_no_op"

    .line 591
    .line 592
    invoke-virtual {v2, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 593
    .line 594
    .line 595
    move-result p2

    .line 596
    iget-object p3, p3, LD4/e;->e:LS3/e;

    .line 597
    .line 598
    new-instance p4, LD4/b;

    .line 599
    .line 600
    invoke-direct {p4, p1, p2}, LD4/b;-><init>(Landroid/app/PendingIntent;Z)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {p3, p4}, LS3/e;->b(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_b

    .line 607
    .line 608
    :cond_13
    new-instance p2, Landroid/os/BadParcelableException;

    .line 609
    .line 610
    const-string p3, "Parcel data not fully consumed, unread size: "

    .line 611
    .line 612
    invoke-static {p1, p3}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    invoke-direct {p2, p1}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    throw p2

    .line 620
    :cond_14
    :goto_f
    return v3

    .line 621
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_a
        :pswitch_0
    .end packed-switch

    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    :pswitch_data_2
    .packed-switch 0x3
        :pswitch_11
        :pswitch_10
        :pswitch_b
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method
