.class public final synthetic La3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, La3/l;->a:I

    iput-object p1, p0, La3/l;->b:Ljava/lang/Object;

    iput-object p2, p0, La3/l;->c:Ljava/lang/String;

    iput-object p3, p0, La3/l;->d:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/work/impl/Processor;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, La3/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/l;->b:Ljava/lang/Object;

    iput-object p2, p0, La3/l;->d:Ljava/io/Serializable;

    iput-object p3, p0, La3/l;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, La3/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La3/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/work/impl/Processor;

    .line 9
    .line 10
    iget-object v1, p0, La3/l;->d:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, p0, La3/l;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Landroidx/work/impl/Processor;->a(Landroidx/work/impl/Processor;Ljava/util/ArrayList;Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :pswitch_0
    iget-object v0, p0, La3/l;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/content/Context;

    .line 24
    .line 25
    iget-object v1, p0, La3/l;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, La3/l;->d:Ljava/io/Serializable;

    .line 28
    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, La3/o;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)La3/D;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_1
    iget-object v0, p0, La3/l;->b:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v2, v0

    .line 39
    check-cast v2, Landroid/content/Context;

    .line 40
    .line 41
    iget-object v3, p0, La3/l;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v0, p0, La3/l;->d:Ljava/io/Serializable;

    .line 44
    .line 45
    move-object v6, v0

    .line 46
    check-cast v6, Ljava/lang/String;

    .line 47
    .line 48
    sget-object v0, Ly4/b;->b:Lk3/d;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    const-class v1, Lk3/d;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_0
    sget-object v0, Ly4/b;->b:Lk3/d;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    new-instance v0, Lk3/d;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    sget-object v5, Ly4/b;->c:Lk3/c;

    .line 66
    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    const-class v5, Lk3/c;

    .line 70
    .line 71
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 72
    :try_start_1
    sget-object v7, Ly4/b;->c:Lk3/c;

    .line 73
    .line 74
    if-nez v7, :cond_0

    .line 75
    .line 76
    new-instance v7, Lk3/c;

    .line 77
    .line 78
    new-instance v8, La3/d;

    .line 79
    .line 80
    invoke-direct {v8, v4}, La3/d;-><init>(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v7, v8}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sput-object v7, Ly4/b;->c:Lk3/c;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_1

    .line 91
    :cond_0
    :goto_0
    monitor-exit v5

    .line 92
    move-object v5, v7

    .line 93
    goto :goto_2

    .line 94
    :goto_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :try_start_2
    throw v0

    .line 96
    :cond_1
    :goto_2
    new-instance v4, LO3/D;

    .line 97
    .line 98
    const/16 v7, 0x17

    .line 99
    .line 100
    invoke-direct {v4, v7}, LO3/D;-><init>(I)V

    .line 101
    .line 102
    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-direct {v0, v7, v5, v4}, Lk3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Ly4/b;->b:Lk3/d;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    goto :goto_4

    .line 112
    :cond_2
    :goto_3
    monitor-exit v1

    .line 113
    :cond_3
    move-object v1, v0

    .line 114
    goto :goto_5

    .line 115
    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 116
    throw v0

    .line 117
    :goto_5
    const/4 v4, 0x2

    .line 118
    const/4 v5, 0x1

    .line 119
    const/4 v7, 0x0

    .line 120
    if-eqz v6, :cond_7

    .line 121
    .line 122
    iget-object v0, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lk3/c;

    .line 125
    .line 126
    :try_start_3
    invoke-virtual {v0, v3}, Lk3/c;->k(Ljava/lang/String;)Ljava/io/File;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez v0, :cond_4

    .line 131
    .line 132
    :catch_0
    move-object v0, v7

    .line 133
    goto :goto_7

    .line 134
    :cond_4
    new-instance v8, Ljava/io/FileInputStream;

    .line 135
    .line 136
    invoke-direct {v8, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    const-string v10, ".zip"

    .line 144
    .line 145
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_5

    .line 150
    .line 151
    sget-object v9, Lk3/b;->s:Lk3/b;

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    const-string v10, ".gz"

    .line 159
    .line 160
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-eqz v9, :cond_6

    .line 165
    .line 166
    sget-object v9, Lk3/b;->t:Lk3/b;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    sget-object v9, Lk3/b;->r:Lk3/b;

    .line 170
    .line 171
    :goto_6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Ln3/c;->a()V

    .line 175
    .line 176
    .line 177
    new-instance v0, Landroid/util/Pair;

    .line 178
    .line 179
    invoke-direct {v0, v9, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :goto_7
    if-nez v0, :cond_8

    .line 183
    .line 184
    :cond_7
    move-object v0, v7

    .line 185
    goto :goto_9

    .line 186
    :cond_8
    iget-object v8, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v8, Lk3/b;

    .line 189
    .line 190
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Ljava/io/InputStream;

    .line 193
    .line 194
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eq v8, v5, :cond_a

    .line 199
    .line 200
    if-eq v8, v4, :cond_9

    .line 201
    .line 202
    invoke-static {v0, v6}, La3/o;->d(Ljava/io/InputStream;Ljava/lang/String;)La3/D;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    goto :goto_8

    .line 207
    :cond_9
    :try_start_4
    new-instance v8, Ljava/util/zip/GZIPInputStream;

    .line 208
    .line 209
    invoke-direct {v8, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v8, v6}, La3/o;->d(Ljava/io/InputStream;Ljava/lang/String;)La3/D;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 216
    goto :goto_8

    .line 217
    :catch_1
    move-exception v0

    .line 218
    new-instance v8, La3/D;

    .line 219
    .line 220
    invoke-direct {v8, v0}, La3/D;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object v0, v8

    .line 224
    goto :goto_8

    .line 225
    :cond_a
    new-instance v8, Ljava/util/zip/ZipInputStream;

    .line 226
    .line 227
    invoke-direct {v8, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v2, v8, v6}, La3/o;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)La3/D;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :goto_8
    iget-object v0, v0, La3/D;->a:La3/k;

    .line 235
    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    :goto_9
    if-eqz v0, :cond_b

    .line 239
    .line 240
    new-instance v1, La3/D;

    .line 241
    .line 242
    invoke-direct {v1, v0}, La3/D;-><init>(La3/k;)V

    .line 243
    .line 244
    .line 245
    goto :goto_d

    .line 246
    :cond_b
    invoke-static {}, Ln3/c;->a()V

    .line 247
    .line 248
    .line 249
    const-string v8, "LottieFetchResult close failed "

    .line 250
    .line 251
    invoke-static {}, Ln3/c;->a()V

    .line 252
    .line 253
    .line 254
    :try_start_5
    invoke-static {v3}, LO3/D;->q(Ljava/lang/String;)Lk3/a;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    iget-object v0, v7, Lk3/a;->r:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    :try_start_6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    div-int/lit8 v10, v10, 0x64
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 268
    .line 269
    if-ne v10, v4, :cond_c

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :catch_2
    :cond_c
    move v5, v9

    .line 273
    :goto_a
    if-eqz v5, :cond_d

    .line 274
    .line 275
    :try_start_7
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual/range {v1 .. v6}, Lk3/d;->t(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)La3/D;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    iget-object v0, v1, La3/D;->a:La3/k;

    .line 288
    .line 289
    invoke-static {}, Ln3/c;->a()V

    .line 290
    .line 291
    .line 292
    goto :goto_b

    .line 293
    :catchall_2
    move-exception v0

    .line 294
    move-object v1, v0

    .line 295
    goto :goto_e

    .line 296
    :catch_3
    move-exception v0

    .line 297
    goto :goto_c

    .line 298
    :cond_d
    new-instance v1, La3/D;

    .line 299
    .line 300
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    invoke-virtual {v7}, Lk3/a;->a()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-direct {v1, v0}, La3/D;-><init>(Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 310
    .line 311
    .line 312
    :goto_b
    :try_start_8
    invoke-virtual {v7}, Lk3/a;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 313
    .line 314
    .line 315
    goto :goto_d

    .line 316
    :goto_c
    :try_start_9
    new-instance v1, La3/D;

    .line 317
    .line 318
    invoke-direct {v1, v0}, La3/D;-><init>(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 319
    .line 320
    .line 321
    if-eqz v7, :cond_e

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :catch_4
    move-exception v0

    .line 325
    invoke-static {v8, v0}, Ln3/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :cond_e
    :goto_d
    if-eqz v6, :cond_f

    .line 329
    .line 330
    iget-object v0, v1, La3/D;->a:La3/k;

    .line 331
    .line 332
    if-eqz v0, :cond_f

    .line 333
    .line 334
    sget-object v2, Lg3/g;->b:Lg3/g;

    .line 335
    .line 336
    iget-object v2, v2, Lg3/g;->a:Ld2/d0;

    .line 337
    .line 338
    invoke-virtual {v2, v6, v0}, Ld2/d0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_f
    return-object v1

    .line 342
    :goto_e
    if-eqz v7, :cond_10

    .line 343
    .line 344
    :try_start_a
    invoke-virtual {v7}, Lk3/a;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 345
    .line 346
    .line 347
    goto :goto_f

    .line 348
    :catch_5
    move-exception v0

    .line 349
    invoke-static {v8, v0}, Ln3/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 350
    .line 351
    .line 352
    :cond_10
    :goto_f
    throw v1

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
