.class public final LR4/t0;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LR4/t0;->a:I

    iput-object p2, p0, LR4/t0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, LR4/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, "view"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "url"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, LR4/t0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, LR4/u0;

    .line 23
    .line 24
    iget-object p2, p2, LR4/u0;->a:Lcom/web2native/MainActivity;

    .line 25
    .line 26
    const-string v0, "print"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v1, v0, Landroid/print/PrintManager;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    check-cast v0, Landroid/print/PrintManager;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, LQ2/g;->A(Lcom/web2native/MainActivity;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->createPrintDocumentAdapter(Ljava/lang/String;)Landroid/print/PrintDocumentAdapter;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v1, "createPrintDocumentAdapter(...)"

    .line 51
    .line 52
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Landroid/print/PrintAttributes$Builder;

    .line 56
    .line 57
    invoke-direct {v1}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, p2, p1, v1}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    iget v0, p0, LR4/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LR4/t0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LR4/k1;

    .line 13
    .line 14
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 15
    .line 16
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p3, "google.com/url?q"

    .line 28
    .line 29
    invoke-static {p2, p3}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_4

    .line 34
    .line 35
    :cond_0
    iget-boolean p2, v0, LR4/k1;->W:Z

    .line 36
    .line 37
    if-nez p2, :cond_4

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p2, 0x0

    .line 47
    :goto_0
    if-eqz p2, :cond_4

    .line 48
    .line 49
    new-instance p2, Landroid/content/Intent;

    .line 50
    .line 51
    iget-object p3, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 52
    .line 53
    const-class v1, Lcom/web2native/MainActivity;

    .line 54
    .line 55
    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    const-string p3, "url"

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    iget-object p1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget-object p1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_1
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 8

    .line 1
    iget v0, p0, LR4/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "request"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v0, "toString(...)"

    .line 25
    .line 26
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LR4/t0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LR4/k1;

    .line 32
    .line 33
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 34
    .line 35
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x1

    .line 40
    if-eqz v1, :cond_10

    .line 41
    .line 42
    const-string v1, "__/auth/handler"

    .line 43
    .line 44
    invoke-static {p2, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    iget-object v1, v1, LR4/i;->N:LR4/P0;

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    iget-object v1, v1, LR4/P0;->d:Ljava/lang/Boolean;

    .line 61
    .line 62
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v1, v4

    .line 70
    :goto_0
    if-eqz v1, :cond_2

    .line 71
    .line 72
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    iget-object v1, v1, LR4/i;->N:LR4/P0;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    iget-object v1, v1, LR4/P0;->b:Ljava/lang/String;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object v1, v3

    .line 84
    :goto_1
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iput-object p2, v0, LR4/k1;->A:Ljava/lang/String;

    .line 87
    .line 88
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 89
    .line 90
    if-eqz p1, :cond_10

    .line 91
    .line 92
    const-string p2, "googleGsiLoginScreen"

    .line 93
    .line 94
    invoke-static {p1, p2}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_a

    .line 98
    .line 99
    :cond_2
    const-string v1, "google.com/url?q"

    .line 100
    .line 101
    invoke-static {p2, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_3
    const-string v1, "blob"

    .line 110
    .line 111
    invoke-static {p2, v1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    iget-object p1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 118
    .line 119
    if-eqz p1, :cond_10

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_a

    .line 125
    .line 126
    :cond_4
    const-string v5, "intent://"

    .line 127
    .line 128
    invoke-static {p2, v5, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    const-string v6, "android.intent.action.VIEW"

    .line 133
    .line 134
    if-nez v5, :cond_e

    .line 135
    .line 136
    const-string v5, "rib://"

    .line 137
    .line 138
    invoke-static {p2, v5, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_5

    .line 143
    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_5
    const-string p1, "http"

    .line 147
    .line 148
    invoke-static {p2, p1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_d

    .line 153
    .line 154
    :try_start_0
    const-string p1, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 155
    .line 156
    :try_start_1
    const-string v5, "://"

    .line 157
    .line 158
    const/4 v7, 0x6

    .line 159
    invoke-static {p2, v5, v4, v7}, LJ5/m;->S0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-virtual {p2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    const-string v7, "substring(...)"

    .line 168
    .line 169
    invoke-static {v5, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 170
    .line 171
    .line 172
    move-object p1, v5

    .line 173
    goto :goto_2

    .line 174
    :catch_0
    :try_start_2
    const-string v5, "Failed to get urlSchemeProtocol"

    .line 175
    .line 176
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 177
    .line 178
    invoke-virtual {v7, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :goto_2
    const-string v5, "data:image"

    .line 182
    .line 183
    invoke-static {p2, v5, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-nez v5, :cond_10

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-lez v5, :cond_6

    .line 194
    .line 195
    move v5, v2

    .line 196
    goto :goto_3

    .line 197
    :cond_6
    move v5, v4

    .line 198
    :goto_3
    if-eqz v5, :cond_8

    .line 199
    .line 200
    iget-object v5, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 201
    .line 202
    if-eqz v5, :cond_7

    .line 203
    .line 204
    invoke-virtual {v5}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    goto :goto_4

    .line 209
    :catch_1
    move-exception p1

    .line 210
    goto :goto_6

    .line 211
    :cond_7
    :goto_4
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v3, p1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_8

    .line 219
    .line 220
    goto/16 :goto_a

    .line 221
    .line 222
    :cond_8
    const-string p1, "about:blank#blocked"

    .line 223
    .line 224
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_10

    .line 229
    .line 230
    invoke-static {p2, v1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_9

    .line 235
    .line 236
    new-instance p1, Landroid/content/Intent;

    .line 237
    .line 238
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-direct {p1, v6, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 243
    .line 244
    .line 245
    iget-object v3, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 246
    .line 247
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 248
    .line 249
    .line 250
    goto/16 :goto_a

    .line 251
    .line 252
    :cond_9
    :goto_5
    move v2, v4

    .line 253
    goto/16 :goto_a

    .line 254
    .line 255
    :goto_6
    const-string v3, "truecallersdk"

    .line 256
    .line 257
    invoke-static {p2, v3, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_a

    .line 262
    .line 263
    iget-object p2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 264
    .line 265
    const-string v0, "Truecaller app not installed"

    .line 266
    .line 267
    invoke-static {p2, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_a
    invoke-static {p2, v1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_b

    .line 280
    .line 281
    invoke-static {p2, v1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_c

    .line 286
    .line 287
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 288
    .line 289
    if-eqz v0, :cond_c

    .line 290
    .line 291
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_b
    iget-object p2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 296
    .line 297
    const-string v0, "App failed to load the url"

    .line 298
    .line 299
    invoke-static {p2, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 304
    .line 305
    .line 306
    :cond_c
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 307
    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_d
    iget-boolean p1, v0, LR4/k1;->W:Z

    .line 311
    .line 312
    if-nez p1, :cond_10

    .line 313
    .line 314
    new-instance p1, Landroid/content/Intent;

    .line 315
    .line 316
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 317
    .line 318
    const-class v3, Lcom/web2native/MainActivity;

    .line 319
    .line 320
    invoke-direct {p1, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 321
    .line 322
    .line 323
    const-string v1, "url"

    .line 324
    .line 325
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    .line 327
    .line 328
    iget-object p2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 329
    .line 330
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 331
    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_e
    :goto_8
    :try_start_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {p2, v2}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    if-eqz p2, :cond_10

    .line 343
    .line 344
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V
    :try_end_3
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_2

    .line 345
    .line 346
    .line 347
    :try_start_4
    invoke-virtual {v1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/URISyntaxException; {:try_start_4 .. :try_end_4} :catch_2

    .line 348
    .line 349
    .line 350
    goto :goto_a

    .line 351
    :catch_2
    move-exception p1

    .line 352
    goto :goto_9

    .line 353
    :catch_3
    :try_start_5
    const-string p1, "browser_fallback_url"

    .line 354
    .line 355
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    if-eqz p1, :cond_f

    .line 360
    .line 361
    new-instance p2, Landroid/content/Intent;

    .line 362
    .line 363
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-direct {p2, v6, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 371
    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_f
    iget-object p1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 375
    .line 376
    const-string p2, "Issue in opening the app/link"

    .line 377
    .line 378
    invoke-static {p1, p2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_2

    .line 383
    .line 384
    .line 385
    goto :goto_a

    .line 386
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 387
    .line 388
    .line 389
    :cond_10
    :goto_a
    return v2

    .line 390
    :pswitch_0
    const-string v0, "view"

    .line 391
    .line 392
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    const-string p1, "request"

    .line 396
    .line 397
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    const/4 p1, 0x0

    .line 401
    return p1

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
