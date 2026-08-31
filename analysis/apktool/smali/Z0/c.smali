.class public final LZ0/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LZ0/r;

.field public final synthetic s:LB0/L;


# direct methods
.method public synthetic constructor <init>(LZ0/r;LB0/L;I)V
    .locals 0

    .line 1
    iput p3, p0, LZ0/c;->q:I

    iput-object p1, p0, LZ0/c;->r:LZ0/r;

    iput-object p2, p0, LZ0/c;->s:LB0/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LZ0/c;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lz0/m;

    .line 7
    .line 8
    iget-object v0, p0, LZ0/c;->s:LB0/L;

    .line 9
    .line 10
    iget-object v1, p0, LZ0/c;->r:LZ0/r;

    .line 11
    .line 12
    invoke-static {v1, v0}, LZ0/l;->d(LZ0/r;LB0/L;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, LZ0/j;->s:LB0/t0;

    .line 16
    .line 17
    check-cast v0, LC0/A;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput-boolean v2, v0, LC0/A;->N:Z

    .line 21
    .line 22
    iget-object v0, v1, LZ0/j;->D:[I

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aget v4, v0, v3

    .line 26
    .line 27
    aget v5, v0, v2

    .line 28
    .line 29
    invoke-virtual {v1}, LZ0/j;->getView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 34
    .line 35
    .line 36
    iget-wide v6, v1, LZ0/j;->E:J

    .line 37
    .line 38
    invoke-interface {p1}, Lz0/m;->E()J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    iput-wide v8, v1, LZ0/j;->E:J

    .line 43
    .line 44
    iget-object p1, v1, LZ0/j;->F:Lw1/o0;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    aget v3, v0, v3

    .line 49
    .line 50
    if-ne v4, v3, :cond_0

    .line 51
    .line 52
    aget v0, v0, v2

    .line 53
    .line 54
    if-ne v5, v0, :cond_0

    .line 55
    .line 56
    invoke-static {v6, v7, v8, v9}, LW0/k;->a(JJ)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    :cond_0
    invoke-virtual {v1, p1}, LZ0/j;->n(Lw1/o0;)Lw1/o0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lw1/o0;->f()Landroid/view/WindowInsets;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, LZ0/j;->getView()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 77
    .line 78
    .line 79
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, Lz0/I;

    .line 83
    .line 84
    iget-object p1, p0, LZ0/c;->r:LZ0/r;

    .line 85
    .line 86
    iget-object v0, p0, LZ0/c;->s:LB0/L;

    .line 87
    .line 88
    invoke-static {p1, v0}, LZ0/l;->d(LZ0/r;LB0/L;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_1
    check-cast p1, LB0/t0;

    .line 95
    .line 96
    instance-of v0, p1, LC0/A;

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    check-cast p1, LC0/A;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    const/4 p1, 0x0

    .line 104
    :goto_0
    iget-object v0, p0, LZ0/c;->r:LZ0/r;

    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, LC0/k0;->getHolderToLayoutNode()Ljava/util/HashMap;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v2, p0, LZ0/c;->s:LB0/L;

    .line 117
    .line 118
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, LC0/k0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 141
    .line 142
    .line 143
    new-instance v1, LC0/o;

    .line 144
    .line 145
    invoke-direct {v1, p1, v2, p1}, LC0/o;-><init>(LC0/A;LB0/L;LC0/A;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {v0}, LZ0/j;->getView()Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-eq p1, v0, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0}, LZ0/j;->getView()Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
