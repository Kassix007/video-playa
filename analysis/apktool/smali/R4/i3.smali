.class public final synthetic LR4/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/l3;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LR4/l3;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LR4/i3;->q:I

    iput-object p1, p0, LR4/i3;->r:LR4/l3;

    iput-object p2, p0, LR4/i3;->s:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LR4/l3;I)V
    .locals 0

    .line 2
    iput p3, p0, LR4/i3;->q:I

    iput-object p1, p0, LR4/i3;->s:Ljava/lang/String;

    iput-object p2, p0, LR4/i3;->r:LR4/l3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LR4/i3;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/i3;->r:LR4/l3;

    .line 7
    .line 8
    iget-object v3, v0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    iget-object v6, v0, LR4/l3;->a:LR4/k1;

    .line 11
    .line 12
    const-string v0, "dataObject"

    .line 13
    .line 14
    invoke-static {v6, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LR4/i3;->s:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_8

    .line 20
    .line 21
    invoke-static {v0}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "type"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v2, v5

    .line 49
    :goto_0
    const-string v4, "url"

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    move-object v2, v4

    .line 54
    :cond_2
    const-string v7, "text"

    .line 55
    .line 56
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v7, v5

    .line 68
    :goto_1
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v4, v5

    .line 80
    :goto_2
    const-string v8, "extension"

    .line 81
    .line 82
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_5

    .line 87
    .line 88
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :cond_5
    const-string v1, "file"

    .line 93
    .line 94
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_7

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    :try_start_0
    new-instance v1, LR4/h3;

    .line 110
    .line 111
    move-object v2, v4

    .line 112
    move-object v4, v5

    .line 113
    move-object v5, v7

    .line 114
    invoke-direct/range {v1 .. v6}, LR4/h3;-><init>(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;LR4/k1;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :catch_0
    move-exception v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    :goto_3
    invoke-static {v3, v0}, LQ2/g;->M(Lcom/web2native/MainActivity;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_8
    :goto_4
    return-void

    .line 130
    :pswitch_0
    iget-object v0, p0, LR4/i3;->r:LR4/l3;

    .line 131
    .line 132
    iget-object v0, v0, LR4/l3;->m:Landroid/webkit/WebView;

    .line 133
    .line 134
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v2, "javascript:window.WebToNativeInterface.androidAdMobCBHook(\'"

    .line 140
    .line 141
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v2, p0, LR4/i3;->s:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v2, "\');"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_1
    iget-object v0, p0, LR4/i3;->r:LR4/l3;

    .line 163
    .line 164
    iget-object v1, p0, LR4/i3;->s:Ljava/lang/String;

    .line 165
    .line 166
    :try_start_1
    iget-object v0, v0, LR4/l3;->m:Landroid/webkit/WebView;

    .line 167
    .line 168
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :catch_1
    move-exception v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 180
    .line 181
    .line 182
    :goto_5
    return-void

    .line 183
    :pswitch_2
    iget-object v0, p0, LR4/i3;->s:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v1, p0, LR4/i3;->r:LR4/l3;

    .line 186
    .line 187
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    .line 188
    .line 189
    const-string v3, "android.intent.action.VIEW"

    .line 190
    .line 191
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, v1, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :catch_2
    move-exception v0

    .line 205
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 206
    .line 207
    .line 208
    :goto_6
    return-void

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
