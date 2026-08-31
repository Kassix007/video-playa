.class public final synthetic LU4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LP/W;LR4/k1;I)V
    .locals 0

    .line 1
    iput p3, p0, LU4/n;->q:I

    iput-object p1, p0, LU4/n;->s:LP/W;

    iput-object p2, p0, LU4/n;->r:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LR4/k1;LP/W;I)V
    .locals 0

    .line 2
    iput p3, p0, LU4/n;->q:I

    iput-object p1, p0, LU4/n;->r:LR4/k1;

    iput-object p2, p0, LU4/n;->s:LP/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LU4/n;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    iget-object v1, p0, LU4/n;->s:LP/W;

    .line 9
    .line 10
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, LU4/n;->r:LR4/k1;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v3, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 27
    .line 28
    .line 29
    iget-object v2, v3, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-interface {v1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 38
    .line 39
    const-string v2, "Press again to exit"

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    new-instance v0, Landroid/os/Handler;

    .line 50
    .line 51
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, LU4/j;

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    invoke-direct {v2, v1, v3}, LU4/j;-><init>(LP/W;I)V

    .line 62
    .line 63
    .line 64
    const-wide/16 v3, 0x7d0

    .line 65
    .line 66
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    iget-object v1, p0, LU4/n;->s:LP/W;

    .line 75
    .line 76
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget-object v3, p0, LU4/n;->r:LR4/k1;

    .line 87
    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    iget-object v2, v3, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 91
    .line 92
    invoke-virtual {v2}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 93
    .line 94
    .line 95
    iget-object v2, v3, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-interface {v1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 104
    .line 105
    const-string v2, "Press again to exit"

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 113
    .line 114
    .line 115
    new-instance v0, Landroid/os/Handler;

    .line 116
    .line 117
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 122
    .line 123
    .line 124
    new-instance v2, LU4/j;

    .line 125
    .line 126
    const/4 v3, 0x2

    .line 127
    invoke-direct {v2, v1, v3}, LU4/j;-><init>(LP/W;I)V

    .line 128
    .line 129
    .line 130
    const-wide/16 v3, 0x7d0

    .line 131
    .line 132
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :pswitch_1
    iget-object v0, p0, LU4/n;->s:LP/W;

    .line 137
    .line 138
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroid/webkit/WebView;

    .line 143
    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    iget-object v0, p0, LU4/n;->r:LR4/k1;

    .line 157
    .line 158
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 159
    .line 160
    if-eqz v0, :cond_3

    .line 161
    .line 162
    invoke-virtual {v0}, LT1/u;->c()V

    .line 163
    .line 164
    .line 165
    :cond_3
    :goto_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_2
    iget-object v0, p0, LU4/n;->s:LP/W;

    .line 169
    .line 170
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, LR4/k;

    .line 175
    .line 176
    iget-object v1, p0, LU4/n;->r:LR4/k1;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, LR4/k;->b(LR4/k1;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :pswitch_3
    iget-object v0, p0, LU4/n;->s:LP/W;

    .line 183
    .line 184
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, LR4/k;

    .line 189
    .line 190
    iget-object v1, p0, LU4/n;->r:LR4/k1;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, LR4/k;->b(LR4/k1;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :pswitch_4
    iget-object v0, p0, LU4/n;->s:LP/W;

    .line 197
    .line 198
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Landroid/webkit/WebView;

    .line 203
    .line 204
    if-eqz v0, :cond_5

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_4

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_4
    iget-object v0, p0, LU4/n;->r:LR4/k1;

    .line 217
    .line 218
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 219
    .line 220
    if-eqz v0, :cond_5

    .line 221
    .line 222
    invoke-virtual {v0}, LT1/u;->c()V

    .line 223
    .line 224
    .line 225
    :cond_5
    :goto_2
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 226
    .line 227
    return-object v0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
