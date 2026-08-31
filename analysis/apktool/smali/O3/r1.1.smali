.class public final LO3/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LO3/a2;

.field public final synthetic s:LO3/w1;


# direct methods
.method public constructor <init>(LO3/w1;LO3/a2;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LO3/r1;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/r1;->r:LO3/a2;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/r1;->s:LO3/w1;

    return-void
.end method

.method public synthetic constructor <init>(LO3/w1;LO3/a2;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/r1;->q:I

    iput-object p2, p0, LO3/r1;->r:LO3/a2;

    iput-object p1, p0, LO3/r1;->s:LO3/w1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LO3/r1;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/r1;->s:LO3/w1;

    .line 7
    .line 8
    iget-object v1, v0, LO3/w1;->u:LO3/I;

    .line 9
    .line 10
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LO3/t0;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 17
    .line 18
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 22
    .line 23
    const-string v1, "Failed to send consent settings to service"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    iget-object v3, p0, LO3/r1;->r:LO3/a2;

    .line 30
    .line 31
    invoke-interface {v1, v3}, LO3/I;->F(LO3/a2;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    iget-object v1, v2, LO3/t0;->v:LO3/X;

    .line 40
    .line 41
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 45
    .line 46
    const-string v2, "Failed to send consent settings to the service"

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    iget-object v0, p0, LO3/r1;->s:LO3/w1;

    .line 53
    .line 54
    iget-object v1, v0, LO3/w1;->u:LO3/I;

    .line 55
    .line 56
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, LO3/t0;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 63
    .line 64
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 68
    .line 69
    const-string v1, "Failed to send measurementEnabled to service"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :try_start_1
    iget-object v3, p0, LO3/r1;->r:LO3/a2;

    .line 76
    .line 77
    invoke-interface {v1, v3}, LO3/I;->B(LO3/a2;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_1
    move-exception v0

    .line 85
    iget-object v1, v2, LO3/t0;->v:LO3/X;

    .line 86
    .line 87
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 91
    .line 92
    const-string v2, "Failed to send measurementEnabled to the service"

    .line 93
    .line 94
    invoke-virtual {v1, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    return-void

    .line 98
    :pswitch_1
    iget-object v0, p0, LO3/r1;->s:LO3/w1;

    .line 99
    .line 100
    iget-object v1, v0, LO3/w1;->u:LO3/I;

    .line 101
    .line 102
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, LO3/t0;

    .line 105
    .line 106
    if-nez v1, :cond_2

    .line 107
    .line 108
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 109
    .line 110
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, LO3/X;->z:LO3/V;

    .line 114
    .line 115
    const-string v1, "Failed to send app backgrounded"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    :try_start_2
    iget-object v3, p0, LO3/r1;->r:LO3/a2;

    .line 122
    .line 123
    invoke-interface {v1, v3}, LO3/I;->q(LO3/a2;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catch_2
    move-exception v0

    .line 131
    iget-object v1, v2, LO3/t0;->v:LO3/X;

    .line 132
    .line 133
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 137
    .line 138
    const-string v2, "Failed to send app backgrounded to the service"

    .line 139
    .line 140
    invoke-virtual {v1, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    return-void

    .line 144
    :pswitch_2
    iget-object v0, p0, LO3/r1;->s:LO3/w1;

    .line 145
    .line 146
    iget-object v1, v0, LO3/w1;->u:LO3/I;

    .line 147
    .line 148
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, LO3/t0;

    .line 151
    .line 152
    if-nez v1, :cond_3

    .line 153
    .line 154
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 155
    .line 156
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 160
    .line 161
    const-string v1, "Discarding data. Failed to send app launch"

    .line 162
    .line 163
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_3
    :try_start_3
    iget-object v3, p0, LO3/r1;->r:LO3/a2;

    .line 168
    .line 169
    iget-object v4, v2, LO3/t0;->t:LO3/g;

    .line 170
    .line 171
    sget-object v5, LO3/F;->c1:LO3/E;

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    invoke-virtual {v4, v6, v5}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_4

    .line 179
    .line 180
    invoke-virtual {v0, v1, v6, v3}, LO3/w1;->G(LO3/I;Ly3/a;LO3/a2;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :catch_3
    move-exception v0

    .line 185
    goto :goto_4

    .line 186
    :cond_4
    :goto_3
    invoke-interface {v1, v3}, LO3/I;->n(LO3/a2;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, LO3/t0;->n()LO3/P;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v4}, LO3/P;->t()Z

    .line 194
    .line 195
    .line 196
    iget-object v4, v2, LO3/t0;->t:LO3/g;

    .line 197
    .line 198
    invoke-virtual {v4, v6, v5}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1, v6, v3}, LO3/w1;->G(LO3/I;Ly3/a;LO3/a2;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :goto_4
    iget-object v1, v2, LO3/t0;->v:LO3/X;

    .line 209
    .line 210
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 214
    .line 215
    const-string v2, "Failed to send app launch to the service"

    .line 216
    .line 217
    invoke-virtual {v1, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :goto_5
    return-void

    .line 221
    :pswitch_3
    iget-object v0, p0, LO3/r1;->s:LO3/w1;

    .line 222
    .line 223
    iget-object v1, v0, LO3/w1;->u:LO3/I;

    .line 224
    .line 225
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v2, LO3/t0;

    .line 228
    .line 229
    if-nez v1, :cond_5

    .line 230
    .line 231
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 232
    .line 233
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 237
    .line 238
    const-string v1, "Failed to reset data on the service: not connected to service"

    .line 239
    .line 240
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_5
    :try_start_4
    iget-object v3, p0, LO3/r1;->r:LO3/a2;

    .line 245
    .line 246
    invoke-interface {v1, v3}, LO3/I;->l(LO3/a2;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :catch_4
    move-exception v1

    .line 251
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 252
    .line 253
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 254
    .line 255
    .line 256
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 257
    .line 258
    const-string v3, "Failed to reset data on the service: remote exception"

    .line 259
    .line 260
    invoke-virtual {v2, v1, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :goto_6
    invoke-virtual {v0}, LO3/w1;->B()V

    .line 264
    .line 265
    .line 266
    :goto_7
    return-void

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
