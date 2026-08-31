.class public final synthetic LU4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LP/W;LP/W;I)V
    .locals 0

    .line 1
    iput p3, p0, LU4/i;->q:I

    iput-object p1, p0, LU4/i;->r:LP/W;

    iput-object p2, p0, LU4/i;->s:LP/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, LU4/i;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LU4/i;->s:LP/W;

    .line 6
    .line 7
    iget-object v3, p0, LU4/i;->r:LP/W;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Li0/b;

    .line 14
    .line 15
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lg5/c;

    .line 20
    .line 21
    iget-object p1, p1, Lg5/c;->f:Landroid/content/Intent;

    .line 22
    .line 23
    if-eqz p1, :cond_9

    .line 24
    .line 25
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lg5/c;

    .line 30
    .line 31
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lg5/c;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v6, "extra_download_id"

    .line 41
    .line 42
    const-wide/16 v7, -0x1

    .line 43
    .line 44
    invoke-virtual {p1, v6, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    iget-wide v8, v5, Lg5/c;->e:J

    .line 49
    .line 50
    cmp-long p1, v6, v8

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    const/4 v7, 0x0

    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    new-instance p1, Landroid/app/DownloadManager$Query;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/app/DownloadManager$Query;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-wide v8, v5, Lg5/c;->e:J

    .line 62
    .line 63
    new-array v10, v6, [J

    .line 64
    .line 65
    aput-wide v8, v10, v4

    .line 66
    .line 67
    invoke-virtual {p1, v10}, Landroid/app/DownloadManager$Query;->setFilterById([J)Landroid/app/DownloadManager$Query;

    .line 68
    .line 69
    .line 70
    iget-object v5, v5, Lg5/c;->b:Landroid/app/DownloadManager;

    .line 71
    .line 72
    invoke-virtual {v5, p1}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v5, "query(...)"

    .line 77
    .line 78
    invoke-static {p1, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_0

    .line 86
    .line 87
    const-string v5, "status"

    .line 88
    .line 89
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/16 v8, 0x8

    .line 94
    .line 95
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-ne v8, v5, :cond_0

    .line 100
    .line 101
    const-string v5, "local_uri"

    .line 102
    .line 103
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-ltz v5, :cond_0

    .line 108
    .line 109
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_0

    .line 118
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 119
    .line 120
    .line 121
    :cond_1
    move-object p1, v7

    .line 122
    :goto_0
    iget-object v5, v0, Lg5/c;->a:LR4/k1;

    .line 123
    .line 124
    iget-object v0, v0, Lg5/c;->d:Ljava/lang/String;

    .line 125
    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    if-nez p1, :cond_2

    .line 129
    .line 130
    new-instance p1, Ljava/io/File;

    .line 131
    .line 132
    sget-object v8, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v8}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-direct {p1, v8, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_3

    .line 147
    .line 148
    new-instance v8, Ljava/io/File;

    .line 149
    .line 150
    invoke-direct {v8, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    move-object p1, v8

    .line 154
    goto :goto_1

    .line 155
    :cond_3
    move-object p1, v7

    .line 156
    :goto_1
    if-nez p1, :cond_4

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :cond_4
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-static {v0}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    if-eqz v9, :cond_5

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-nez v10, :cond_6

    .line 175
    .line 176
    :cond_5
    :try_start_0
    const-string v10, "."

    .line 177
    .line 178
    const/4 v11, 0x6

    .line 179
    invoke-static {v11, v0, v10}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    add-int/2addr v10, v6

    .line 184
    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const-string v10, "substring(...)"

    .line 189
    .line 190
    invoke-static {v0, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :catch_0
    move-exception v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 202
    .line 203
    .line 204
    :cond_6
    move-object v0, v7

    .line 205
    :goto_2
    new-instance v10, Landroid/content/Intent;

    .line 206
    .line 207
    const-string v11, "android.intent.action.VIEW"

    .line 208
    .line 209
    invoke-direct {v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/high16 v11, 0x14000000

    .line 213
    .line 214
    invoke-virtual {v10, v11}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 215
    .line 216
    .line 217
    iget-object v11, v5, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 218
    .line 219
    iget-object v12, v5, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 220
    .line 221
    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    iget-object v5, v5, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 226
    .line 227
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    new-instance v13, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v5, ".provider"

    .line 240
    .line 241
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-static {v11, v5, p1}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-nez v0, :cond_7

    .line 253
    .line 254
    if-eqz v9, :cond_7

    .line 255
    .line 256
    invoke-virtual {v8, v9}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    if-eqz v5, :cond_7

    .line 261
    .line 262
    invoke-virtual {v8, v9}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v10, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_7
    invoke-virtual {v10, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    .line 272
    .line 273
    :goto_3
    invoke-virtual {v10, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 274
    .line 275
    .line 276
    :try_start_1
    invoke-virtual {v12, v10}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :catch_1
    const-string p1, "No application available to open this file"

    .line 281
    .line 282
    invoke-static {v12, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 287
    .line 288
    .line 289
    :cond_8
    :goto_4
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    check-cast p1, Lg5/c;

    .line 294
    .line 295
    iput-object v7, p1, Lg5/c;->f:Landroid/content/Intent;

    .line 296
    .line 297
    :cond_9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-interface {v2, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    return-object v1

    .line 303
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 304
    .line 305
    invoke-interface {v3, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    new-instance p1, Landroid/os/Handler;

    .line 309
    .line 310
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 315
    .line 316
    .line 317
    new-instance v0, LU4/j;

    .line 318
    .line 319
    invoke-direct {v0, v2, v4}, LU4/j;-><init>(LP/W;I)V

    .line 320
    .line 321
    .line 322
    const-wide/16 v2, 0x3e8

    .line 323
    .line 324
    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 325
    .line 326
    .line 327
    return-object v1

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
