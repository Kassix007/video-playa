.class public final synthetic Le5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:Le5/b;

.field public final synthetic t:LB5/a;


# direct methods
.method public synthetic constructor <init>(LR4/k1;Le5/b;LB5/a;I)V
    .locals 0

    .line 1
    iput p4, p0, Le5/c;->q:I

    iput-object p1, p0, Le5/c;->r:LR4/k1;

    iput-object p2, p0, Le5/c;->s:Le5/b;

    iput-object p3, p0, Le5/c;->t:LB5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Le5/c;->q:I

    .line 2
    .line 3
    check-cast p1, Li0/b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Le5/a;

    .line 9
    .line 10
    iget-object v0, p0, Le5/c;->r:LR4/k1;

    .line 11
    .line 12
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 13
    .line 14
    invoke-direct {p1, v1}, Le5/a;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Le5/c;->s:Le5/b;

    .line 18
    .line 19
    iget-object v2, v1, Le5/b;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Le5/a;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v1, Le5/b;->f:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, LT1/u;->c()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Le5/c;->t:LB5/a;

    .line 59
    .line 60
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    new-instance p1, Le5/d;

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iget-object v1, p0, Le5/c;->t:LB5/a;

    .line 70
    .line 71
    invoke-direct {p1, v1, v0}, Le5/d;-><init>(LB5/a;I)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Le5/c;->r:LR4/k1;

    .line 75
    .line 76
    iget-object v1, p0, Le5/c;->s:Le5/b;

    .line 77
    .line 78
    invoke-static {v0, v1, p1}, LQ2/g;->j(LR4/k1;Le5/b;LB5/a;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_1
    const-string p1, "#FFFFFF"

    .line 85
    .line 86
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1}, Lj0/B;->b(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    sget-object p1, Lj0/B;->a:LO3/D;

    .line 95
    .line 96
    sget-object v2, Lc0/j;->q:Lc0/j;

    .line 97
    .line 98
    invoke-static {v2, v0, v1, p1}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 99
    .line 100
    .line 101
    new-instance p1, Le5/a;

    .line 102
    .line 103
    iget-object v0, p0, Le5/c;->r:LR4/k1;

    .line 104
    .line 105
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 106
    .line 107
    invoke-direct {p1, v1}, Le5/a;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Le5/c;->s:Le5/b;

    .line 111
    .line 112
    iget-object v2, v1, Le5/b;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Le5/a;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v1, Le5/b;->f:Ljava/lang/String;

    .line 121
    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    const-string v1, ""

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_4

    .line 131
    .line 132
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 133
    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 144
    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    invoke-virtual {p1}, LT1/u;->c()V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    iget-object p1, p0, Le5/c;->t:LB5/a;

    .line 152
    .line 153
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_5
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_2
    new-instance p1, Le5/d;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    iget-object v1, p0, Le5/c;->t:LB5/a;

    .line 163
    .line 164
    invoke-direct {p1, v1, v0}, Le5/d;-><init>(LB5/a;I)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Le5/c;->r:LR4/k1;

    .line 168
    .line 169
    iget-object v1, p0, Le5/c;->s:Le5/b;

    .line 170
    .line 171
    invoke-static {v0, v1, p1}, LQ2/g;->j(LR4/k1;Le5/b;LB5/a;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
