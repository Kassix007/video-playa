.class public final synthetic LE1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LE1/n;->q:I

    iput-object p1, p0, LE1/n;->r:Ljava/lang/Object;

    iput-object p2, p0, LE1/n;->s:Ljava/lang/Object;

    iput-object p3, p0, LE1/n;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LE1/n;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/work/impl/WorkLauncherImpl;

    .line 9
    .line 10
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/work/impl/StartStopToken;

    .line 13
    .line 14
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/work/WorkerParameters$RuntimeExtras;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Landroidx/work/impl/WorkLauncherImpl;->a(Landroidx/work/impl/WorkLauncherImpl;Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroidx/work/impl/Processor;

    .line 25
    .line 26
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, LI4/b;

    .line 29
    .line 30
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroidx/work/impl/WorkerWrapper;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Landroidx/work/impl/Processor;->c(Landroidx/work/impl/Processor;LI4/b;Landroidx/work/impl/WorkerWrapper;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, LR4/l3;

    .line 45
    .line 46
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, v1, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    iget-object v1, v1, LR4/l3;->a:LR4/k1;

    .line 54
    .line 55
    invoke-static {v0, v3, v2, v4, v1}, LR4/V;->g(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;LR4/k1;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lorg/json/JSONObject;

    .line 62
    .line 63
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, LR4/l3;

    .line 70
    .line 71
    const-string v3, "contacts"

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    :try_start_0
    const-string v0, "UTF-8"

    .line 80
    .line 81
    invoke-static {v1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "encode(...)"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    iget-object v1, v2, LR4/l3;->m:Landroid/webkit/WebView;

    .line 91
    .line 92
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v3, "javascript:window.WebToNativeInterface.androidCBHook("

    .line 98
    .line 99
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, ");"

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catch_0
    move-exception v0

    .line 119
    new-instance v1, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_0
    iget-object v0, v2, LR4/l3;->m:Landroid/webkit/WebView;

    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v3, "javascript:window.WebToNativeInterface.androidCBHook(\'"

    .line 133
    .line 134
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, "\');"

    .line 141
    .line 142
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    return-void

    .line 153
    :pswitch_3
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, LR4/u0;

    .line 156
    .line 157
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 162
    .line 163
    move-object v5, v2

    .line 164
    check-cast v5, Ljava/lang/String;

    .line 165
    .line 166
    new-instance v3, Landroid/webkit/WebView;

    .line 167
    .line 168
    iget-object v2, v0, LR4/u0;->a:Lcom/web2native/MainActivity;

    .line 169
    .line 170
    invoke-direct {v3, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    new-instance v2, LR4/t0;

    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    invoke-direct {v2, v4, v0}, LR4/t0;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 180
    .line 181
    .line 182
    const-string v0, "html"

    .line 183
    .line 184
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_1

    .line 189
    .line 190
    const-string v6, "text/HTML"

    .line 191
    .line 192
    const-string v7, "UTF-8"

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    const-string v0, "url"

    .line 201
    .line 202
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_2

    .line 207
    .line 208
    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_2
    :goto_1
    return-void

    .line 212
    :pswitch_4
    iget-object v0, p0, LE1/n;->r:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, LE1/p;

    .line 215
    .line 216
    iget-object v1, p0, LE1/n;->s:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, Ll6/d;

    .line 219
    .line 220
    iget-object v2, p0, LE1/n;->t:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 223
    .line 224
    :try_start_1
    iget-object v0, v0, LE1/p;->a:Landroid/content/Context;

    .line 225
    .line 226
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->j(Landroid/content/Context;)LE1/w;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_3

    .line 231
    .line 232
    iget-object v3, v0, LE1/g;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, LE1/k;

    .line 235
    .line 236
    check-cast v3, LE1/v;

    .line 237
    .line 238
    iget-object v4, v3, LE1/v;->d:Ljava/lang/Object;

    .line 239
    .line 240
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    :try_start_2
    iput-object v2, v3, LE1/v;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 242
    .line 243
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 244
    :try_start_3
    iget-object v0, v0, LE1/g;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, LE1/k;

    .line 247
    .line 248
    new-instance v3, LE1/o;

    .line 249
    .line 250
    invoke-direct {v3, v1, v2}, LE1/o;-><init>(Ll6/d;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v0, v3}, LE1/k;->a(Ll6/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :catchall_0
    move-exception v0

    .line 258
    goto :goto_2

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 261
    :try_start_5
    throw v0

    .line 262
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 263
    .line 264
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 265
    .line 266
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 270
    :goto_2
    invoke-virtual {v1, v0}, Ll6/d;->z(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 274
    .line 275
    .line 276
    :goto_3
    return-void

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
