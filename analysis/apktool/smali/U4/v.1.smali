.class public final synthetic LU4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lj5/b;

.field public final synthetic s:LR4/k1;

.field public final synthetic t:LM5/w;

.field public final synthetic u:LP/W;

.field public final synthetic v:LM/I0;


# direct methods
.method public synthetic constructor <init>(Lj5/b;LR4/k1;LM5/w;LP/W;LM/I0;I)V
    .locals 0

    .line 1
    iput p6, p0, LU4/v;->q:I

    iput-object p1, p0, LU4/v;->r:Lj5/b;

    iput-object p2, p0, LU4/v;->s:LR4/k1;

    iput-object p3, p0, LU4/v;->t:LM5/w;

    iput-object p4, p0, LU4/v;->u:LP/W;

    iput-object p5, p0, LU4/v;->v:LM/I0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LU4/v;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/v;->r:Lj5/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LU4/v;->u:LP/W;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {v1, v2}, LU4/a;->j(LP/W;Z)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, LU4/v;->s:LR4/k1;

    .line 18
    .line 19
    iget-object v4, v3, LR4/k1;->k:Landroid/webkit/WebView;

    .line 20
    .line 21
    iget-object v5, v3, LR4/k1;->S:Lg5/h;

    .line 22
    .line 23
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v6, "android.permission.RECORD_AUDIO"

    .line 31
    .line 32
    invoke-static {v4, v6}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v7, 0x0

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    iget-object v4, v5, Lg5/h;->i:Le/g;

    .line 40
    .line 41
    const-string v6, "audio"

    .line 42
    .line 43
    invoke-virtual {v4, v6}, Le/g;->u(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    iget-object v4, v5, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    invoke-interface {v4, v7}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v4, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 55
    .line 56
    const-string v5, "No voice recorder application found on device."

    .line 57
    .line 58
    invoke-static {v4, v5, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object v2, v5, Lg5/h;->o:Le/g;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v2, v6}, Le/g;->u(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    new-instance v2, LU4/B;

    .line 74
    .line 75
    iget-object v4, p0, LU4/v;->v:LM/I0;

    .line 76
    .line 77
    invoke-direct {v2, v4, v3, v1, v7}, LU4/B;-><init>(LM/I0;LR4/k1;LP/W;Lq5/c;)V

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x3

    .line 81
    iget-object v3, p0, LU4/v;->t:LM5/w;

    .line 82
    .line 83
    invoke-static {v3, v7, v7, v2, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, Lj5/b;->e:LP5/S;

    .line 90
    .line 91
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v7, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_0
    iget-object v0, p0, LU4/v;->r:Lj5/b;

    .line 103
    .line 104
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, LU4/v;->u:LP/W;

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    invoke-static {v1, v2}, LU4/a;->j(LP/W;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, LU4/v;->s:LR4/k1;

    .line 114
    .line 115
    iget-object v4, v3, LR4/k1;->k:Landroid/webkit/WebView;

    .line 116
    .line 117
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const-string v5, "android.permission.CAMERA"

    .line 125
    .line 126
    invoke-static {v4, v5}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_3

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    const/4 v2, 0x0

    .line 134
    :goto_2
    iget-object v4, v3, LR4/k1;->S:Lg5/h;

    .line 135
    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    iget-object v2, v4, Lg5/h;->h:Le/g;

    .line 139
    .line 140
    const-string v4, "video"

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Le/g;->u(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    iget-object v2, v4, Lg5/h;->l:Le/g;

    .line 147
    .line 148
    invoke-virtual {v2, v5}, Le/g;->u(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_3
    new-instance v2, LU4/A;

    .line 152
    .line 153
    iget-object v4, p0, LU4/v;->v:LM/I0;

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    invoke-direct {v2, v4, v3, v1, v5}, LU4/A;-><init>(LM/I0;LR4/k1;LP/W;Lq5/c;)V

    .line 157
    .line 158
    .line 159
    const/4 v1, 0x3

    .line 160
    iget-object v3, p0, LU4/v;->t:LM5/w;

    .line 161
    .line 162
    invoke-static {v3, v5, v5, v2, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lj5/b;->g()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lj5/b;->f()V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_1
    iget-object v0, p0, LU4/v;->r:Lj5/b;

    .line 176
    .line 177
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, LU4/v;->u:LP/W;

    .line 181
    .line 182
    const/4 v2, 0x1

    .line 183
    invoke-static {v1, v2}, LU4/a;->j(LP/W;Z)V

    .line 184
    .line 185
    .line 186
    iget-object v3, p0, LU4/v;->s:LR4/k1;

    .line 187
    .line 188
    iget-object v4, v3, LR4/k1;->k:Landroid/webkit/WebView;

    .line 189
    .line 190
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    const-string v5, "android.permission.CAMERA"

    .line 198
    .line 199
    invoke-static {v4, v5}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_5

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_5
    const/4 v2, 0x0

    .line 207
    :goto_4
    iget-object v4, v3, LR4/k1;->S:Lg5/h;

    .line 208
    .line 209
    if-eqz v2, :cond_6

    .line 210
    .line 211
    iget-object v2, v4, Lg5/h;->h:Le/g;

    .line 212
    .line 213
    const-string v4, "image"

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Le/g;->u(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_6
    iget-object v2, v4, Lg5/h;->l:Le/g;

    .line 220
    .line 221
    invoke-virtual {v2, v5}, Le/g;->u(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :goto_5
    new-instance v2, LU4/z;

    .line 225
    .line 226
    iget-object v4, p0, LU4/v;->v:LM/I0;

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    invoke-direct {v2, v4, v3, v1, v5}, LU4/z;-><init>(LM/I0;LR4/k1;LP/W;Lq5/c;)V

    .line 230
    .line 231
    .line 232
    const/4 v1, 0x3

    .line 233
    iget-object v3, p0, LU4/v;->t:LM5/w;

    .line 234
    .line 235
    invoke-static {v3, v5, v5, v2, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Lj5/b;->g()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Lj5/b;->f()V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
