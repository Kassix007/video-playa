.class public final LU4/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/g;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LU4/g;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU4/g;->s:LP/W;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LU4/g;

    .line 2
    .line 3
    iget-object v0, p0, LU4/g;->r:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, LU4/g;->s:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, LU4/g;->q:LR4/k1;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU4/g;-><init>(LR4/k1;LP/W;LP/W;Lq5/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LU4/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lc0/b;->y:Lc0/e;

    .line 2
    .line 3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LU4/g;->q:LR4/k1;

    .line 7
    .line 8
    iget-object v1, p1, LR4/k1;->d:LR4/i;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, LR4/i;->m:LR4/G;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, LR4/G;->a:Ljava/lang/Boolean;

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-eqz v1, :cond_f

    .line 27
    .line 28
    iget-object v1, p1, LR4/k1;->d:LR4/i;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v3, v1, LR4/i;->m:LR4/G;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v3, v2

    .line 37
    :goto_1
    if-eqz v3, :cond_f

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v3, v1, LR4/i;->m:LR4/G;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    iget-object v3, v3, LR4/G;->b:LR4/D;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move-object v3, v2

    .line 49
    :goto_2
    if-eqz v3, :cond_f

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    iget-object v1, v1, LR4/i;->m:LR4/G;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    iget-object v1, v1, LR4/G;->b:LR4/D;

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    iget-object v1, v1, LR4/D;->a:Ljava/lang/String;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move-object v1, v2

    .line 65
    :goto_3
    const-string v3, "None"

    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_f

    .line 72
    .line 73
    iget-object v1, p1, LR4/k1;->d:LR4/i;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    iget-object v3, v1, LR4/i;->m:LR4/G;

    .line 78
    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    iget-object v3, v3, LR4/G;->b:LR4/D;

    .line 82
    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    iget-object v3, v3, LR4/D;->b:Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    move-object v3, v2

    .line 89
    :goto_4
    if-eqz v3, :cond_f

    .line 90
    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    iget-object v1, v1, LR4/i;->m:LR4/G;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    iget-object v1, v1, LR4/G;->b:LR4/D;

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-object v1, v1, LR4/D;->b:Ljava/lang/String;

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move-object v1, v2

    .line 105
    :goto_5
    const-string v3, ""

    .line 106
    .line 107
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_f

    .line 112
    .line 113
    iget-object v1, p1, LR4/k1;->l:Lk5/b;

    .line 114
    .line 115
    iget-object v3, p0, LU4/g;->r:LP/W;

    .line 116
    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    iget-object v1, v1, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 120
    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget-object v4, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 124
    .line 125
    new-instance v5, LU4/f;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-direct {v5, p1, v3, v6}, LU4/f;-><init>(LR4/k1;LP/W;I)V

    .line 129
    .line 130
    .line 131
    new-instance v6, LR4/J0;

    .line 132
    .line 133
    const/4 v7, 0x1

    .line 134
    invoke-direct {v6, v5, v7}, LR4/J0;-><init>(LB5/c;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v4, v6}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    iget-object p1, p1, LR4/k1;->d:LR4/i;

    .line 141
    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    iget-object p1, p1, LR4/i;->m:LR4/G;

    .line 145
    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    iget-object p1, p1, LR4/G;->b:LR4/D;

    .line 149
    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    iget-object v2, p1, LR4/D;->a:Ljava/lang/String;

    .line 153
    .line 154
    :cond_7
    if-eqz v2, :cond_d

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    sparse-switch p1, :sswitch_data_0

    .line 161
    .line 162
    .line 163
    goto :goto_6

    .line 164
    :sswitch_0
    const-string p1, "Bottom Left"

    .line 165
    .line 166
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_8

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    sget-object v0, Lc0/b;->w:Lc0/e;

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :sswitch_1
    const-string p1, "Bottom Right"

    .line 177
    .line 178
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_e

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :sswitch_2
    const-string p1, "Right Center"

    .line 186
    .line 187
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-nez p1, :cond_9

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    sget-object v0, Lc0/b;->v:Lc0/e;

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :sswitch_3
    const-string p1, "Top Right"

    .line 198
    .line 199
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-nez p1, :cond_a

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_a
    sget-object v0, Lc0/b;->s:Lc0/e;

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :sswitch_4
    const-string p1, "Left Center"

    .line 210
    .line 211
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-nez p1, :cond_b

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    sget-object v0, Lc0/b;->t:Lc0/e;

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :sswitch_5
    const-string p1, "Top Left"

    .line 222
    .line 223
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-nez p1, :cond_c

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_c
    sget-object v0, Lc0/b;->q:Lc0/e;

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_d
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-interface {v3, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_e
    :goto_7
    iget-object p1, p0, LU4/g;->s:LP/W;

    .line 239
    .line 240
    invoke-interface {p1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_f
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 244
    .line 245
    return-object p1

    .line 246
    nop

    .line 247
    :sswitch_data_0
    .sparse-switch
        -0x3943cbce -> :sswitch_5
        -0x30f59d72 -> :sswitch_4
        0x1120b351 -> :sswitch_3
        0x34f55b19 -> :sswitch_2
        0x373947e7 -> :sswitch_1
        0x3b93b4dc -> :sswitch_0
    .end sparse-switch
.end method
