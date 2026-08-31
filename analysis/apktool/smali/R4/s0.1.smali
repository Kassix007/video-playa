.class public final LR4/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/web2native/MainActivity;

.field public final b:LR4/k1;


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;LR4/k1;I)V
    .locals 2

    .line 1
    packed-switch p3, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p3, "dataObject"

    .line 5
    .line 6
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 13
    .line 14
    iput-object p2, p0, LR4/s0;->b:LR4/k1;

    .line 15
    .line 16
    iget-object p1, p2, LR4/k1;->S:Lg5/h;

    .line 17
    .line 18
    invoke-virtual {p1}, Lg5/h;->h()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    const-string p3, "dataObject"

    .line 23
    .line 24
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 31
    .line 32
    iput-object p2, p0, LR4/s0;->b:LR4/k1;

    .line 33
    .line 34
    iget-object p1, p2, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Li1/a;

    .line 49
    .line 50
    invoke-direct {v1, p3, v0}, Li1/a;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p2, LR4/k1;->Y:Li1/a;

    .line 54
    .line 55
    new-instance p3, LC0/m;

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    invoke-direct {p3, v0, p0}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p2, LR4/k1;->s:Lj5/c;

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    iget-object p1, p1, Lj5/c;->h:Landroidx/lifecycle/J;

    .line 69
    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    iget-object p2, p2, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 73
    .line 74
    new-instance p3, LR4/K0;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-direct {p3, p0, v0}, LR4/K0;-><init>(LR4/s0;I)V

    .line 78
    .line 79
    .line 80
    new-instance v0, LR4/N;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-direct {v0, p3, v1}, LR4/N;-><init>(LB5/c;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(LR4/s0;Lcom/web2native/MainActivity;Ljava/io/InputStream;[BLjava/lang/String;Ljava/lang/String;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    and-int/lit8 v3, p6, 0x2

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    move-object v3, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p2

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v5, p6, 0x4

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    move-object v5, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v5, p3

    .line 23
    .line 24
    :goto_1
    iget-object v6, v1, LR4/s0;->b:LR4/k1;

    .line 25
    .line 26
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    const-string v9, "."

    .line 30
    .line 31
    const-string v10, "/"

    .line 32
    .line 33
    const/16 v11, 0x1d

    .line 34
    .line 35
    if-lt v7, v11, :cond_d

    .line 36
    .line 37
    const-string v12, "mime_type"

    .line 38
    .line 39
    const-string v13, "_display_name"

    .line 40
    .line 41
    const-string v14, "relative_path"

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    new-instance v4, Landroid/content/ContentValues;

    .line 46
    .line 47
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v13, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v12, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-lt v7, v11, :cond_3

    .line 57
    .line 58
    iget-object v0, v6, LR4/k1;->d:LR4/i;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object v0, v0, LR4/i;->z:LR4/Y;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget-object v0, v0, LR4/Y;->a:Ljava/lang/Boolean;

    .line 67
    .line 68
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/4 v15, 0x0

    .line 76
    :goto_2
    if-eqz v15, :cond_3

    .line 77
    .line 78
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v2, v6, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v2, v5}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v4, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {}, LA3/a;->f()Landroid/net/Uri;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0, v2, v4}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    if-eqz v2, :cond_11

    .line 134
    .line 135
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 136
    .line 137
    .line 138
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 139
    :try_start_1
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v2}, La/a;->r(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 143
    .line 144
    .line 145
    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    .line 147
    .line 148
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, LR4/s0;->f()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_12

    .line 158
    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto :goto_7

    .line 161
    :catch_0
    move-exception v0

    .line 162
    goto :goto_6

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object v2, v0

    .line 165
    goto :goto_5

    .line 166
    :catchall_2
    move-exception v0

    .line 167
    move-object v4, v0

    .line 168
    :try_start_4
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 169
    :catchall_3
    move-exception v0

    .line 170
    :try_start_5
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 174
    :goto_5
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 175
    :catchall_4
    move-exception v0

    .line 176
    :try_start_7
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 180
    :goto_6
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :goto_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, LR4/s0;->f()V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :cond_4
    if-eqz v5, :cond_11

    .line 192
    .line 193
    invoke-static {v2, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_5

    .line 198
    .line 199
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 204
    .line 205
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    const/16 p2, 0x0

    .line 210
    .line 211
    const-string v15, "toLowerCase(...)"

    .line 212
    .line 213
    invoke-static {v3, v15}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v3}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-nez v1, :cond_6

    .line 221
    .line 222
    const-string v1, "application/octet-stream"

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_5
    const/16 p2, 0x0

    .line 226
    .line 227
    move-object v1, v2

    .line 228
    :cond_6
    :goto_8
    invoke-static {v2, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_7

    .line 233
    .line 234
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    :cond_7
    invoke-static {v0, v9}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_8

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    new-instance v3, Landroid/content/ContentValues;

    .line 272
    .line 273
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v13, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v6, LR4/k1;->d:LR4/i;

    .line 283
    .line 284
    if-eqz v0, :cond_9

    .line 285
    .line 286
    iget-object v0, v0, LR4/i;->z:LR4/Y;

    .line 287
    .line 288
    if-eqz v0, :cond_9

    .line 289
    .line 290
    iget-object v0, v0, LR4/Y;->a:Ljava/lang/Boolean;

    .line 291
    .line 292
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    goto :goto_a

    .line 299
    :cond_9
    move/from16 v0, p2

    .line 300
    .line 301
    :goto_a
    if-eqz v0, :cond_a

    .line 302
    .line 303
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 304
    .line 305
    iget-object v1, v6, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-virtual {v1, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    new-instance v6, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v3, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_a
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v3, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    :goto_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const-string v1, "is_pending"

    .line 351
    .line 352
    invoke-virtual {v3, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 353
    .line 354
    .line 355
    invoke-static {}, LA3/a;->w()Landroid/net/Uri;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-string v6, "getContentUri(...)"

    .line 360
    .line 361
    invoke-static {v0, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    if-eqz v6, :cond_c

    .line 369
    .line 370
    :try_start_9
    invoke-virtual {v2, v6}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 371
    .line 372
    .line 373
    move-result-object v8
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    .line 374
    if-eqz v8, :cond_b

    .line 375
    .line 376
    :try_start_a
    invoke-virtual {v8, v5}, Ljava/io/OutputStream;->write([B)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 380
    .line 381
    .line 382
    :try_start_b
    invoke-interface {v8}, Ljava/io/Closeable;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1

    .line 383
    .line 384
    .line 385
    if-lt v7, v11, :cond_11

    .line 386
    .line 387
    invoke-virtual {v3}, Landroid/content/ContentValues;->clear()V

    .line 388
    .line 389
    .line 390
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v3, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v6, v3, v4, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :catch_1
    move-exception v0

    .line 402
    goto :goto_c

    .line 403
    :catchall_5
    move-exception v0

    .line 404
    move-object v1, v0

    .line 405
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 406
    :catchall_6
    move-exception v0

    .line 407
    :try_start_d
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_b
    new-instance v0, Ljava/io/IOException;

    .line 412
    .line 413
    const-string v1, "Failed to open output stream"

    .line 414
    .line 415
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1

    .line 419
    :goto_c
    invoke-virtual {v2, v6, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 424
    .line 425
    const-string v1, "Failed to insert file into MediaStore"

    .line 426
    .line 427
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :cond_d
    if-eqz v3, :cond_11

    .line 432
    .line 433
    filled-new-array {v10}, [Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-static {v2, v5}, LJ5/m;->d1(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Ljava/lang/String;

    .line 446
    .line 447
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    invoke-static {v0, v9}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    const-string v7, "._"

    .line 460
    .line 461
    if-eqz v6, :cond_e

    .line 462
    .line 463
    new-instance v6, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    :goto_d
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    goto :goto_e

    .line 482
    :cond_e
    new-instance v6, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    goto :goto_d

    .line 503
    :goto_e
    invoke-virtual {v1, v0}, LR4/s0;->b(Ljava/lang/String;)Ljava/io/File;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    :try_start_e
    new-instance v5, Ljava/io/FileOutputStream;

    .line 508
    .line 509
    invoke-direct {v5, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 510
    .line 511
    .line 512
    :try_start_f
    invoke-static {v3, v5}, La/a;->r(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 513
    .line 514
    .line 515
    :try_start_10
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 516
    .line 517
    .line 518
    const-string v5, "png"

    .line 519
    .line 520
    invoke-static {v2, v5}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    if-nez v5, :cond_f

    .line 525
    .line 526
    const-string v5, "jpg"

    .line 527
    .line 528
    invoke-static {v2, v5}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_10

    .line 533
    .line 534
    goto :goto_f

    .line 535
    :catchall_7
    move-exception v0

    .line 536
    goto :goto_11

    .line 537
    :catch_2
    move-exception v0

    .line 538
    goto :goto_10

    .line 539
    :cond_f
    :goto_f
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    const-string v2, "getPath(...)"

    .line 544
    .line 545
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    iget-object v2, v1, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 549
    .line 550
    filled-new-array {v0}, [Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    new-instance v5, LR4/l0;

    .line 555
    .line 556
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 557
    .line 558
    .line 559
    invoke-static {v2, v0, v4, v5}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 560
    .line 561
    .line 562
    :cond_10
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v1}, LR4/s0;->f()V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :catchall_8
    move-exception v0

    .line 570
    move-object v2, v0

    .line 571
    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 572
    :catchall_9
    move-exception v0

    .line 573
    :try_start_12
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 574
    .line 575
    .line 576
    throw v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 577
    :goto_10
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, LR4/s0;->f()V

    .line 584
    .line 585
    .line 586
    goto :goto_12

    .line 587
    :goto_11
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v1}, LR4/s0;->f()V

    .line 591
    .line 592
    .line 593
    throw v0

    .line 594
    :cond_11
    :goto_12
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ls5/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "input"

    .line 8
    .line 9
    const-string v4, "UTF-8"

    .line 10
    .line 11
    const-string v5, "data:"

    .line 12
    .line 13
    instance-of v6, v2, LR4/n0;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    move-object v6, v2

    .line 18
    check-cast v6, LR4/n0;

    .line 19
    .line 20
    iget v7, v6, LR4/n0;->s:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v7, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v8

    .line 29
    iput v7, v6, LR4/n0;->s:I

    .line 30
    .line 31
    :goto_0
    move-object v7, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v6, LR4/n0;

    .line 34
    .line 35
    invoke-direct {v6, v1, v2}, LR4/n0;-><init>(LR4/s0;Ls5/c;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v2, v7, LR4/n0;->q:Ljava/lang/Object;

    .line 40
    .line 41
    iget v6, v7, LR4/n0;->s:I

    .line 42
    .line 43
    sget-object v8, Lm5/y;->a:Lm5/y;

    .line 44
    .line 45
    const/4 v9, 0x1

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-ne v6, v9, :cond_1

    .line 49
    .line 50
    :try_start_0
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-object v8

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto/16 :goto_14

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    const-string v2, ";base64"

    .line 69
    .line 70
    invoke-static {v0, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    const/16 v6, 0xa

    .line 75
    .line 76
    const-string v10, "compile(...)"

    .line 77
    .line 78
    sget-object v11, Ln5/s;->q:Ln5/s;

    .line 79
    .line 80
    const-string v12, ","

    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    if-eqz v2, :cond_7

    .line 84
    .line 85
    :try_start_2
    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-static {v12, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    if-nez v14, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    move/from16 p3, v9

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    new-instance v14, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v14, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    move/from16 p3, v9

    .line 119
    .line 120
    move v15, v13

    .line 121
    :cond_4
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->start()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {v0, v15, v9}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->end()I

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-nez v9, :cond_4

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    invoke-virtual {v0, v15, v9}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-object v12, v14

    .line 162
    :goto_2
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-nez v9, :cond_6

    .line 167
    .line 168
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    invoke-interface {v12, v9}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    :goto_3
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    if-eqz v14, :cond_6

    .line 181
    .line 182
    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    check-cast v14, Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-nez v14, :cond_5

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_5
    check-cast v12, Ljava/lang/Iterable;

    .line 196
    .line 197
    invoke-interface {v9}, Ljava/util/ListIterator;->nextIndex()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    add-int/lit8 v9, v9, 0x1

    .line 202
    .line 203
    invoke-static {v12, v9}, Ln5/l;->y0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    goto :goto_4

    .line 208
    :cond_6
    move-object v9, v11

    .line 209
    :goto_4
    check-cast v9, Ljava/util/Collection;

    .line 210
    .line 211
    new-array v12, v13, [Ljava/lang/String;

    .line 212
    .line 213
    invoke-interface {v9, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    check-cast v9, [Ljava/lang/String;

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_7
    move/from16 p3, v9

    .line 221
    .line 222
    invoke-static {v0, v12}, LJ5/m;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    invoke-static {v0, v12}, LJ5/m;->h1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    filled-new-array {v9, v12}, [Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    :goto_5
    array-length v12, v9

    .line 235
    if-nez v12, :cond_8

    .line 236
    .line 237
    goto/16 :goto_13

    .line 238
    .line 239
    :cond_8
    if-eqz v2, :cond_9

    .line 240
    .line 241
    aget-object v2, v9, p3

    .line 242
    .line 243
    invoke-static {v2, v13}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_6

    .line 248
    :cond_9
    aget-object v2, v9, p3

    .line 249
    .line 250
    invoke-static {v2, v4}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const-string v12, "decode(...)"

    .line 255
    .line 256
    invoke-static {v2, v12}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    const-string v12, "forName(...)"

    .line 264
    .line 265
    invoke-static {v4, v12}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const-string v4, "getBytes(...)"

    .line 273
    .line 274
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :goto_6
    iget-object v4, v1, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 278
    .line 279
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 288
    .line 289
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-static {v0, v5, v13}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    if-eqz v12, :cond_a

    .line 298
    .line 299
    aget-object v3, v9, v13

    .line 300
    .line 301
    invoke-static {v3, v5}, LJ5/m;->h1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    const-string v6, ";"

    .line 306
    .line 307
    invoke-static {v3, v6}, LJ5/m;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    filled-new-array {v3}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    goto/16 :goto_a

    .line 316
    .line 317
    :cond_a
    aget-object v12, v9, v13

    .line 318
    .line 319
    const-string v14, "="

    .line 320
    .line 321
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    invoke-static {v14, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v12, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    if-nez v10, :cond_b

    .line 340
    .line 341
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    goto :goto_8

    .line 350
    :cond_b
    new-instance v10, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 353
    .line 354
    .line 355
    move v6, v13

    .line 356
    :goto_7
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    invoke-virtual {v12, v6, v14}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    if-nez v14, :cond_1d

    .line 380
    .line 381
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    invoke-virtual {v12, v6, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-object v3, v10

    .line 397
    :goto_8
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    if-nez v6, :cond_d

    .line 402
    .line 403
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    invoke-interface {v3, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    :goto_9
    invoke-interface {v6}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    if-eqz v10, :cond_d

    .line 416
    .line 417
    invoke-interface {v6}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    check-cast v10, Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    if-nez v10, :cond_c

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_c
    check-cast v3, Ljava/lang/Iterable;

    .line 431
    .line 432
    invoke-interface {v6}, Ljava/util/ListIterator;->nextIndex()I

    .line 433
    .line 434
    .line 435
    move-result v6

    .line 436
    add-int/lit8 v6, v6, 0x1

    .line 437
    .line 438
    invoke-static {v3, v6}, Ln5/l;->y0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v11

    .line 442
    :cond_d
    check-cast v11, Ljava/util/Collection;

    .line 443
    .line 444
    new-array v3, v13, [Ljava/lang/String;

    .line 445
    .line 446
    invoke-interface {v11, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    check-cast v3, [Ljava/lang/String;

    .line 451
    .line 452
    :goto_a
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-static {v0, v5, v13}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 457
    .line 458
    .line 459
    move-result v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 460
    const-string v10, ""

    .line 461
    .line 462
    if-eqz v5, :cond_10

    .line 463
    .line 464
    :try_start_3
    array-length v5, v3

    .line 465
    if-nez v5, :cond_e

    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_e
    aget-object v3, v3, v13

    .line 469
    .line 470
    if-nez v3, :cond_f

    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_f
    move-object v10, v3

    .line 474
    goto :goto_c

    .line 475
    :cond_10
    :goto_b
    array-length v5, v3

    .line 476
    move/from16 v11, p3

    .line 477
    .line 478
    if-le v5, v11, :cond_11

    .line 479
    .line 480
    aget-object v10, v3, v11

    .line 481
    .line 482
    :cond_11
    :goto_c
    invoke-virtual {v6, v10}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    new-instance v5, Lkotlin/jvm/internal/y;

    .line 487
    .line 488
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 489
    .line 490
    .line 491
    const-string v6, "_"

    .line 492
    .line 493
    if-nez p2, :cond_12

    .line 494
    .line 495
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 496
    .line 497
    .line 498
    move-result-wide v10

    .line 499
    new-instance v12, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    const-string v10, "."

    .line 514
    .line 515
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    goto :goto_d

    .line 526
    :cond_12
    move-object/from16 v10, p2

    .line 527
    .line 528
    :goto_d
    iput-object v10, v5, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 529
    .line 530
    if-nez v3, :cond_14

    .line 531
    .line 532
    const-string v10, "data:text/json"

    .line 533
    .line 534
    invoke-static {v0, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    if-eqz v10, :cond_14

    .line 539
    .line 540
    if-nez p2, :cond_13

    .line 541
    .line 542
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 543
    .line 544
    .line 545
    move-result-wide v10

    .line 546
    new-instance v0, Ljava/lang/StringBuilder;

    .line 547
    .line 548
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-string v4, ".json"

    .line 561
    .line 562
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    goto :goto_e

    .line 570
    :cond_13
    move-object/from16 v0, p2

    .line 571
    .line 572
    :goto_e
    iput-object v0, v5, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 573
    .line 574
    goto/16 :goto_12

    .line 575
    .line 576
    :cond_14
    if-nez v3, :cond_16

    .line 577
    .line 578
    const-string v10, "data:application/pdf"

    .line 579
    .line 580
    invoke-static {v0, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-eqz v10, :cond_16

    .line 585
    .line 586
    if-nez p2, :cond_15

    .line 587
    .line 588
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 589
    .line 590
    .line 591
    move-result-wide v10

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    .line 593
    .line 594
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    const-string v4, ".pdf"

    .line 607
    .line 608
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    goto :goto_f

    .line 616
    :cond_15
    move-object/from16 v0, p2

    .line 617
    .line 618
    :goto_f
    iput-object v0, v5, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 619
    .line 620
    goto/16 :goto_12

    .line 621
    .line 622
    :cond_16
    if-nez v3, :cond_19

    .line 623
    .line 624
    const-string v10, "data:image/"

    .line 625
    .line 626
    invoke-static {v0, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    if-eqz v10, :cond_19

    .line 631
    .line 632
    if-nez p2, :cond_18

    .line 633
    .line 634
    aget-object v0, v9, v13

    .line 635
    .line 636
    const-string v10, "png"

    .line 637
    .line 638
    invoke-static {v0, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_17

    .line 643
    .line 644
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 645
    .line 646
    .line 647
    move-result-wide v10

    .line 648
    new-instance v0, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    const-string v4, ".png"

    .line 663
    .line 664
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    goto :goto_10

    .line 672
    :cond_17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 673
    .line 674
    .line 675
    move-result-wide v10

    .line 676
    new-instance v0, Ljava/lang/StringBuilder;

    .line 677
    .line 678
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    const-string v4, ".jpg"

    .line 691
    .line 692
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    goto :goto_10

    .line 700
    :cond_18
    move-object/from16 v0, p2

    .line 701
    .line 702
    :goto_10
    iput-object v0, v5, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 703
    .line 704
    goto :goto_12

    .line 705
    :cond_19
    if-nez v3, :cond_1b

    .line 706
    .line 707
    const-string v10, "data:text/csv"

    .line 708
    .line 709
    invoke-static {v0, v10}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-eqz v0, :cond_1b

    .line 714
    .line 715
    if-nez p2, :cond_1a

    .line 716
    .line 717
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 718
    .line 719
    .line 720
    move-result-wide v10

    .line 721
    new-instance v0, Ljava/lang/StringBuilder;

    .line 722
    .line 723
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    const-string v4, ".csv"

    .line 736
    .line 737
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    goto :goto_11

    .line 745
    :cond_1a
    move-object/from16 v0, p2

    .line 746
    .line 747
    :goto_11
    iput-object v0, v5, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 748
    .line 749
    :cond_1b
    :goto_12
    sget-object v0, LM5/H;->a:LT5/e;

    .line 750
    .line 751
    sget-object v10, LT5/d;->q:LT5/d;

    .line 752
    .line 753
    new-instance v0, LR4/o0;

    .line 754
    .line 755
    const/4 v6, 0x0

    .line 756
    move-object v4, v3

    .line 757
    move-object v3, v5

    .line 758
    move-object v5, v9

    .line 759
    invoke-direct/range {v0 .. v6}, LR4/o0;-><init>(LR4/s0;[BLkotlin/jvm/internal/y;Ljava/lang/String;[Ljava/lang/String;Lq5/c;)V

    .line 760
    .line 761
    .line 762
    const/4 v1, 0x1

    .line 763
    iput v1, v7, LR4/n0;->s:I

    .line 764
    .line 765
    invoke-static {v10, v0, v7}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 769
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 770
    .line 771
    if-ne v0, v1, :cond_1c

    .line 772
    .line 773
    return-object v1

    .line 774
    :cond_1c
    :goto_13
    return-object v8

    .line 775
    :cond_1d
    move-object/from16 v1, p0

    .line 776
    .line 777
    goto/16 :goto_7

    .line 778
    .line 779
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 780
    .line 781
    .line 782
    return-object v8
.end method

.method public b(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LR4/s0;->b:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, LR4/i;->z:LR4/Y;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, LR4/Y;->a:Ljava/lang/Boolean;

    .line 12
    .line 13
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    new-instance v1, Ljava/io/File;

    .line 24
    .line 25
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v3, p0, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v3}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "/"

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 72
    .line 73
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public c()V
    .locals 5

    .line 1
    iget-object v0, p0, LR4/s0;->b:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->t:Lj5/d;

    .line 4
    .line 5
    iget-object v1, v1, Lj5/d;->D:Landroidx/lifecycle/J;

    .line 6
    .line 7
    iget-object v0, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    new-instance v2, LR4/K0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, LR4/K0;-><init>(LR4/s0;I)V

    .line 13
    .line 14
    .line 15
    new-instance v3, LR4/N;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, v2, v4}, LR4/N;-><init>(LB5/c;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, LR4/s0;->b:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, LR4/L0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3, p0}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v3, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-static {v1, v2}, Lw1/B;->l(Landroid/view/View;Lw1/m;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, LR4/k1;->Y:Li1/a;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LC3/a;

    .line 31
    .line 32
    invoke-virtual {v0}, LC3/a;->R()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    new-instance v0, LR4/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LR4/k0;-><init>(LR4/s0;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
