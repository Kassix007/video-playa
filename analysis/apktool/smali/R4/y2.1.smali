.class public final synthetic LR4/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LR4/y2;->q:I

    iput-object p1, p0, LR4/y2;->r:Ljava/lang/Object;

    iput-object p2, p0, LR4/y2;->s:Ljava/lang/Object;

    iput-object p3, p0, LR4/y2;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LR4/y2;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/y2;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La5/c;

    .line 9
    .line 10
    iget-object v1, p0, LR4/y2;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/a;

    .line 13
    .line 14
    iget-object v2, p0, LR4/y2;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LB5/c;

    .line 17
    .line 18
    check-cast p1, Li0/b;

    .line 19
    .line 20
    iget-object p1, v0, La5/c;->c:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {v2, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-interface {v1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget-object v0, p0, LR4/y2;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LZ4/M;

    .line 36
    .line 37
    iget-object v1, p0, LR4/y2;->s:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, LP/W;

    .line 40
    .line 41
    iget-object v2, p0, LR4/y2;->t:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LP/W;

    .line 44
    .line 45
    check-cast p1, Lc0/m;

    .line 46
    .line 47
    const-string v3, "im"

    .line 48
    .line 49
    invoke-static {p1, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-virtual {v0, p1}, LZ4/M;->c(Z)V

    .line 62
    .line 63
    .line 64
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_1
    iget-object v0, p0, LR4/y2;->r:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La0/q;

    .line 70
    .line 71
    iget-object v1, p0, LR4/y2;->s:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, LT1/d;

    .line 74
    .line 75
    iget-object v2, p0, LR4/y2;->t:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, LU1/r;

    .line 78
    .line 79
    check-cast p1, LP/F;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, La0/q;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    new-instance p1, LU1/n;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {p1, v2, v1, v0, v3}, LU1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_2
    iget-object v0, p0, LR4/y2;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/util/List;

    .line 94
    .line 95
    iget-object v1, p0, LR4/y2;->s:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, LB0/o;

    .line 98
    .line 99
    iget-object v2, p0, LR4/y2;->t:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, LP/c0;

    .line 102
    .line 103
    check-cast p1, Ljava/lang/Integer;

    .line 104
    .line 105
    if-nez p1, :cond_2

    .line 106
    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 v3, 0x64

    .line 114
    .line 115
    if-ne p1, v3, :cond_7

    .line 116
    .line 117
    new-instance p1, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    check-cast v0, Ljava/lang/Iterable;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, LR4/t1;

    .line 142
    .line 143
    if-eqz v4, :cond_3

    .line 144
    .line 145
    iget-object v4, v4, LR4/t1;->b:Ljava/lang/String;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_3
    move-object v4, v3

    .line 149
    :goto_1
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_4
    iget-object v0, v1, LB0/o;->q:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, LR4/k1;

    .line 160
    .line 161
    iget-object v1, v1, LB0/o;->r:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, La5/y;

    .line 164
    .line 165
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 166
    .line 167
    if-eqz v0, :cond_5

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    goto :goto_2

    .line 174
    :cond_5
    move-object v0, v3

    .line 175
    :goto_2
    invoke-static {p1, v0}, Ly4/b;->x(Ljava/util/ArrayList;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-virtual {v2, v0}, LP/c0;->f(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_6

    .line 187
    .line 188
    invoke-virtual {v2}, LP/c0;->e()I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    const/4 v0, -0x1

    .line 193
    if-eq p1, v0, :cond_6

    .line 194
    .line 195
    if-eqz v1, :cond_7

    .line 196
    .line 197
    iget-object p1, v1, La5/y;->h:LP5/S;

    .line 198
    .line 199
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v3, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_6
    if-eqz v1, :cond_7

    .line 209
    .line 210
    iget-object p1, v1, La5/y;->h:LP5/S;

    .line 211
    .line 212
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v3, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    :cond_7
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 221
    .line 222
    return-object p1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
