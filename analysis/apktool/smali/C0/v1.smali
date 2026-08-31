.class public final LC0/v1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LC0/w1;

.field public final synthetic s:LB5/e;


# direct methods
.method public synthetic constructor <init>(LC0/w1;LB5/e;I)V
    .locals 0

    .line 1
    iput p3, p0, LC0/v1;->q:I

    iput-object p1, p0, LC0/v1;->r:LC0/w1;

    iput-object p2, p0, LC0/v1;->s:LB5/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LC0/v1;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_e

    .line 29
    .line 30
    iget-object p2, p0, LC0/v1;->r:LC0/w1;

    .line 31
    .line 32
    iget-object v0, p2, LC0/w1;->q:LC0/A;

    .line 33
    .line 34
    const v1, 0x7f0900fb

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    instance-of v4, v3, Ljava/util/Set;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    instance-of v4, v3, LC5/a;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    instance-of v4, v3, LC5/d;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    :cond_1
    check-cast v3, Ljava/util/Set;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v3, v5

    .line 58
    :goto_1
    if-nez v3, :cond_7

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    instance-of v4, v3, Landroid/view/View;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    check-cast v3, Landroid/view/View;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object v3, v5

    .line 72
    :goto_2
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    move-object v1, v5

    .line 80
    :goto_3
    instance-of v3, v1, Ljava/util/Set;

    .line 81
    .line 82
    if-eqz v3, :cond_6

    .line 83
    .line 84
    instance-of v3, v1, LC5/a;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    instance-of v3, v1, LC5/d;

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    :cond_5
    move-object v3, v1

    .line 93
    check-cast v3, Ljava/util/Set;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move-object v3, v5

    .line 97
    :cond_7
    :goto_4
    if-eqz v3, :cond_9

    .line 98
    .line 99
    iget-object v1, p1, LP/o;->Q:LP/t;

    .line 100
    .line 101
    if-nez v1, :cond_8

    .line 102
    .line 103
    new-instance v1, LP/t;

    .line 104
    .line 105
    iget-object v4, p1, LP/o;->g:LP/u;

    .line 106
    .line 107
    invoke-direct {v1, v4}, LP/t;-><init>(LP/u;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p1, LP/o;->Q:LP/t;

    .line 111
    .line 112
    :cond_8
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iput-boolean v2, p1, LP/o;->p:Z

    .line 116
    .line 117
    iput-boolean v2, p1, LP/o;->B:Z

    .line 118
    .line 119
    iget-object v1, p1, LP/o;->c:LP/A0;

    .line 120
    .line 121
    invoke-virtual {v1}, LP/A0;->g()V

    .line 122
    .line 123
    .line 124
    iget-object v1, p1, LP/o;->G:LP/A0;

    .line 125
    .line 126
    invoke-virtual {v1}, LP/A0;->g()V

    .line 127
    .line 128
    .line 129
    iget-object v1, p1, LP/o;->H:LP/D0;

    .line 130
    .line 131
    iget-object v2, v1, LP/D0;->a:LP/A0;

    .line 132
    .line 133
    iget-object v4, v2, LP/A0;->z:Ljava/util/HashMap;

    .line 134
    .line 135
    iput-object v4, v1, LP/D0;->e:Ljava/util/HashMap;

    .line 136
    .line 137
    iget-object v2, v2, LP/A0;->A:Lr/v;

    .line 138
    .line 139
    iput-object v2, v1, LP/D0;->f:Lr/v;

    .line 140
    .line 141
    :cond_9
    invoke-virtual {p1, p2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    sget-object v4, LP/k;->a:LP/S;

    .line 150
    .line 151
    if-nez v1, :cond_a

    .line 152
    .line 153
    if-ne v2, v4, :cond_b

    .line 154
    .line 155
    :cond_a
    new-instance v2, LC0/t1;

    .line 156
    .line 157
    invoke-direct {v2, p2, v5}, LC0/t1;-><init>(LC0/w1;Lq5/c;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_b
    check-cast v2, LB5/e;

    .line 164
    .line 165
    invoke-static {v2, p1, v0}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    if-nez v1, :cond_c

    .line 177
    .line 178
    if-ne v2, v4, :cond_d

    .line 179
    .line 180
    :cond_c
    new-instance v2, LC0/u1;

    .line 181
    .line 182
    invoke-direct {v2, p2, v5}, LC0/u1;-><init>(LC0/w1;Lq5/c;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_d
    check-cast v2, LB5/e;

    .line 189
    .line 190
    invoke-static {v2, p1, v0}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lb0/b;->a:LP/T0;

    .line 194
    .line 195
    invoke-virtual {v0, v3}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    new-instance v1, LC0/v1;

    .line 200
    .line 201
    iget-object v2, p0, LC0/v1;->s:LB5/e;

    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    invoke-direct {v1, p2, v2, v3}, LC0/v1;-><init>(LC0/w1;LB5/e;I)V

    .line 205
    .line 206
    .line 207
    const p2, -0x4722c3de

    .line 208
    .line 209
    .line 210
    invoke-static {p2, v1, p1}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    const/16 v1, 0x38

    .line 215
    .line 216
    invoke-static {v0, p2, p1, v1}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_e
    invoke-virtual {p1}, LP/o;->N()V

    .line 221
    .line 222
    .line 223
    :goto_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 224
    .line 225
    return-object p1

    .line 226
    :pswitch_0
    check-cast p1, LP/o;

    .line 227
    .line 228
    check-cast p2, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    and-int/lit8 v0, p2, 0x3

    .line 235
    .line 236
    const/4 v1, 0x2

    .line 237
    const/4 v2, 0x0

    .line 238
    const/4 v3, 0x1

    .line 239
    if-eq v0, v1, :cond_f

    .line 240
    .line 241
    move v0, v3

    .line 242
    goto :goto_6

    .line 243
    :cond_f
    move v0, v2

    .line 244
    :goto_6
    and-int/2addr p2, v3

    .line 245
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_10

    .line 250
    .line 251
    iget-object p2, p0, LC0/v1;->r:LC0/w1;

    .line 252
    .line 253
    iget-object p2, p2, LC0/w1;->q:LC0/A;

    .line 254
    .line 255
    iget-object v0, p0, LC0/v1;->s:LB5/e;

    .line 256
    .line 257
    invoke-static {p2, v0, p1, v2}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(LC0/A;LB5/e;LP/o;I)V

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_10
    invoke-virtual {p1}, LP/o;->N()V

    .line 262
    .line 263
    .line 264
    :goto_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 265
    .line 266
    return-object p1

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
