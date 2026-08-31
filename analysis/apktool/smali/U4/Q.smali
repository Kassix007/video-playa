.class public final synthetic LU4/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LR4/k1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p6, p0, LU4/Q;->q:I

    iput-object p1, p0, LU4/Q;->s:Ljava/lang/Object;

    iput-object p2, p0, LU4/Q;->t:Ljava/lang/Object;

    iput-object p3, p0, LU4/Q;->r:Ljava/lang/Object;

    iput-object p4, p0, LU4/Q;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/web2native/MainActivity;Landroid/webkit/WebView;Lcom/web2native/MainActivity;LZ4/M;I)V
    .locals 0

    .line 2
    const/4 p5, 0x1

    iput p5, p0, LU4/Q;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/Q;->r:Ljava/lang/Object;

    iput-object p2, p0, LU4/Q;->s:Ljava/lang/Object;

    iput-object p3, p0, LU4/Q;->t:Ljava/lang/Object;

    iput-object p4, p0, LU4/Q;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LU4/Q;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/Q;->s:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, LR4/k1;

    .line 10
    .line 11
    iget-object v0, p0, LU4/Q;->t:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, LR4/O1;

    .line 15
    .line 16
    iget-object v0, p0, LU4/Q;->r:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lcom/web2native/MainActivity;

    .line 20
    .line 21
    iget-object v0, p0, LU4/Q;->u:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, LB5/c;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, LP/o;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    invoke-static {p1}, LP/b;->w(I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-static/range {v1 .. v6}, LE3/h;->f(LR4/k1;LR4/O1;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    iget-object v0, p0, LU4/Q;->s:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, LR4/k1;

    .line 49
    .line 50
    iget-object v0, p0, LU4/Q;->t:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v0, p0, LU4/Q;->r:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, LU4/Q;->u:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v4, v0

    .line 63
    check-cast v4, Ljava/lang/String;

    .line 64
    .line 65
    move-object v5, p1

    .line 66
    check-cast v5, LP/o;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-static {p1}, LP/b;->w(I)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-static/range {v1 .. v6}, LQ2/g;->e(LR4/k1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP/o;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_1
    iget-object v0, p0, LU4/Q;->s:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    check-cast v1, LR4/k1;

    .line 86
    .line 87
    iget-object v0, p0, LU4/Q;->t:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v2, v0

    .line 90
    check-cast v2, LR4/Y0;

    .line 91
    .line 92
    iget-object v0, p0, LU4/Q;->r:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v3, v0

    .line 95
    check-cast v3, Lcom/web2native/MainActivity;

    .line 96
    .line 97
    iget-object v0, p0, LU4/Q;->u:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v4, v0

    .line 100
    check-cast v4, LB5/c;

    .line 101
    .line 102
    move-object v5, p1

    .line 103
    check-cast v5, LP/o;

    .line 104
    .line 105
    check-cast p2, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x1

    .line 111
    invoke-static {p1}, LP/b;->w(I)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static/range {v1 .. v6}, LC3/a;->h(LR4/k1;LR4/Y0;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_2
    iget-object v0, p0, LU4/Q;->r:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v1, v0

    .line 122
    check-cast v1, Lcom/web2native/MainActivity;

    .line 123
    .line 124
    iget-object v0, p0, LU4/Q;->s:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v2, v0

    .line 127
    check-cast v2, Landroid/webkit/WebView;

    .line 128
    .line 129
    iget-object v0, p0, LU4/Q;->t:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v3, v0

    .line 132
    check-cast v3, Lcom/web2native/MainActivity;

    .line 133
    .line 134
    iget-object v0, p0, LU4/Q;->u:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v4, v0

    .line 137
    check-cast v4, LZ4/M;

    .line 138
    .line 139
    move-object v5, p1

    .line 140
    check-cast v5, LP/o;

    .line 141
    .line 142
    check-cast p2, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const/16 p1, 0x1001

    .line 148
    .line 149
    invoke-static {p1}, LP/b;->w(I)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-static/range {v1 .. v6}, LZ4/L;->d(Lcom/web2native/MainActivity;Landroid/webkit/WebView;Lcom/web2native/MainActivity;LZ4/M;LP/o;I)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :pswitch_3
    iget-object v0, p0, LU4/Q;->s:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v1, v0

    .line 160
    check-cast v1, LR4/k1;

    .line 161
    .line 162
    iget-object v0, p0, LU4/Q;->t:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v2, v0

    .line 165
    check-cast v2, LR4/F1;

    .line 166
    .line 167
    iget-object v0, p0, LU4/Q;->r:Ljava/lang/Object;

    .line 168
    .line 169
    move-object v3, v0

    .line 170
    check-cast v3, Lcom/web2native/MainActivity;

    .line 171
    .line 172
    iget-object v0, p0, LU4/Q;->u:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v4, v0

    .line 175
    check-cast v4, LB5/c;

    .line 176
    .line 177
    move-object v5, p1

    .line 178
    check-cast v5, LP/o;

    .line 179
    .line 180
    check-cast p2, Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const/4 p1, 0x1

    .line 186
    invoke-static {p1}, LP/b;->w(I)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    invoke-static/range {v1 .. v6}, LU4/a;->n(LR4/k1;LR4/F1;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
