.class public final LU4/I;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;


# direct methods
.method public constructor <init>(LR4/k1;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/I;->q:LR4/k1;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, LU4/I;

    .line 2
    .line 3
    iget-object v0, p0, LU4/I;->q:LR4/k1;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LU4/I;-><init>(LR4/k1;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/I;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/I;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/I;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/I;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->r:Landroid/os/Bundle;

    .line 7
    .line 8
    iget-object v1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, LR4/k1;->M:LO3/e0;

    .line 14
    .line 15
    invoke-virtual {v0}, LO3/e0;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, LR4/i;->C:Ljava/lang/Boolean;

    .line 26
    .line 27
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v2

    .line 35
    :goto_0
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, LU4/a;->y(LR4/k1;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v0, p1, LR4/k1;->M:LO3/e0;

    .line 42
    .line 43
    invoke-virtual {v0}, LO3/e0;->b()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p1, LR4/k1;->g:Z

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-static {p1}, LU4/a;->y(LR4/k1;)V

    .line 54
    .line 55
    .line 56
    iput-boolean v2, p1, LR4/k1;->g:Z

    .line 57
    .line 58
    :cond_2
    :goto_1
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 63
    .line 64
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move v0, v2

    .line 72
    :goto_2
    const-string v3, "#ffffff"

    .line 73
    .line 74
    const-string v4, "#000000"

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v5, 0x1e

    .line 81
    .line 82
    if-lt v0, v5, :cond_4

    .line 83
    .line 84
    const/16 v0, 0x8

    .line 85
    .line 86
    invoke-static {v4, v3, v1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 91
    .line 92
    const/4 v5, 0x1

    .line 93
    invoke-static {v0, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    :goto_3
    iget-object v0, p1, LR4/k1;->s:Lj5/c;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget-object v0, v0, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    new-instance v3, LU4/o;

    .line 105
    .line 106
    const/4 v4, 0x3

    .line 107
    invoke-direct {v3, p1, v4}, LU4/o;-><init>(LR4/k1;I)V

    .line 108
    .line 109
    .line 110
    new-instance v4, LR4/J0;

    .line 111
    .line 112
    const/4 v5, 0x3

    .line 113
    invoke-direct {v4, v3, v5}, LR4/J0;-><init>(LB5/c;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    new-instance v0, LR4/O;

    .line 120
    .line 121
    invoke-direct {v0, p1}, LR4/O;-><init>(LR4/k1;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, LR4/V;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v0, p1, LR4/k1;->D:LR4/V;

    .line 130
    .line 131
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 132
    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    iget-object v1, v0, LR4/i;->V:LR4/I1;

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    iget-object v1, v1, LR4/I1;->a:Ljava/lang/Boolean;

    .line 140
    .line 141
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    goto :goto_4

    .line 148
    :cond_6
    move v1, v2

    .line 149
    :goto_4
    if-eqz v1, :cond_7

    .line 150
    .line 151
    iget-object v1, p1, LR4/k1;->S:Lg5/h;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    :cond_7
    new-instance v1, LB0/o;

    .line 157
    .line 158
    const/16 v3, 0x19

    .line 159
    .line 160
    invoke-direct {v1, p1, v3}, LB0/o;-><init>(LR4/k1;I)V

    .line 161
    .line 162
    .line 163
    iput-object v1, p1, LR4/k1;->I:LB0/o;

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    iget-object v1, v0, LR4/i;->w:LR4/c1;

    .line 168
    .line 169
    if-eqz v1, :cond_8

    .line 170
    .line 171
    iget-object v1, v1, LR4/c1;->a:Ljava/lang/Boolean;

    .line 172
    .line 173
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move v1, v2

    .line 181
    :goto_5
    if-eqz v1, :cond_a

    .line 182
    .line 183
    if-eqz v0, :cond_9

    .line 184
    .line 185
    iget-object v1, v0, LR4/i;->w:LR4/c1;

    .line 186
    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    iget-object v1, v1, LR4/c1;->a:Ljava/lang/Boolean;

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_9
    const/4 v1, 0x0

    .line 193
    :goto_6
    if-eqz v1, :cond_a

    .line 194
    .line 195
    :try_start_0
    new-instance v1, LR4/V;

    .line 196
    .line 197
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object v1, p1, LR4/k1;->R:LR4/V;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :catch_0
    move-exception v1

    .line 204
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 205
    .line 206
    .line 207
    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    .line 208
    .line 209
    iget-object v1, v0, LR4/i;->A:LR4/u;

    .line 210
    .line 211
    if-eqz v1, :cond_b

    .line 212
    .line 213
    iget-object v1, v1, LR4/u;->a:Ljava/lang/Boolean;

    .line 214
    .line 215
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    goto :goto_8

    .line 222
    :cond_b
    move v1, v2

    .line 223
    :goto_8
    if-eqz v1, :cond_c

    .line 224
    .line 225
    new-instance v1, LR4/V;

    .line 226
    .line 227
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    iput-object v1, p1, LR4/k1;->i0:LR4/V;

    .line 231
    .line 232
    :cond_c
    if-eqz v0, :cond_d

    .line 233
    .line 234
    iget-object v1, v0, LR4/i;->m:LR4/G;

    .line 235
    .line 236
    if-eqz v1, :cond_d

    .line 237
    .line 238
    iget-object v1, v1, LR4/G;->a:Ljava/lang/Boolean;

    .line 239
    .line 240
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    :cond_d
    if-nez v2, :cond_e

    .line 247
    .line 248
    iget-object p1, p1, LR4/k1;->D:LR4/V;

    .line 249
    .line 250
    if-nez p1, :cond_e

    .line 251
    .line 252
    if-eqz v0, :cond_e

    .line 253
    .line 254
    iget-object p1, v0, LR4/i;->K:LR4/n;

    .line 255
    .line 256
    if-eqz p1, :cond_e

    .line 257
    .line 258
    iget-object p1, p1, LR4/n;->a:Ljava/lang/Boolean;

    .line 259
    .line 260
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_e
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 266
    .line 267
    return-object p1
.end method
