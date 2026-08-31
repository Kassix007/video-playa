.class public final synthetic LZ4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lcom/web2native/MainActivity;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:LP/W;

.field public final synthetic t:LW0/c;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:J

.field public final synthetic w:LB5/c;


# direct methods
.method public synthetic constructor <init>(Lcom/web2native/MainActivity;Ljava/lang/String;LP/W;LW0/c;Ljava/lang/String;JLB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/x;->q:Lcom/web2native/MainActivity;

    iput-object p2, p0, LZ4/x;->r:Ljava/lang/String;

    iput-object p3, p0, LZ4/x;->s:LP/W;

    iput-object p4, p0, LZ4/x;->t:LW0/c;

    iput-object p5, p0, LZ4/x;->u:Ljava/lang/String;

    iput-wide p6, p0, LZ4/x;->v:J

    iput-object p8, p0, LZ4/x;->w:LB5/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "it"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LZ4/x;->s:LP/W;

    .line 9
    .line 10
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/widget/ImageView;

    .line 15
    .line 16
    iget-object v1, p0, LZ4/x;->r:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v8, Landroid/widget/ImageView;

    .line 21
    .line 22
    iget-object v0, p0, LZ4/x;->q:Lcom/web2native/MainActivity;

    .line 23
    .line 24
    invoke-direct {v8, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {v8, v0}, Landroid/view/View;->setId(I)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 35
    .line 36
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lg1/e;

    .line 44
    .line 45
    invoke-direct {v0}, Lg1/e;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lt2/a;->a(Landroid/content/Context;)Lt2/l;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v9, LD2/h;

    .line 60
    .line 61
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v9, v2}, LD2/h;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, v9, LD2/h;->c:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance v1, LF2/a;

    .line 71
    .line 72
    invoke-direct {v1, v8}, LF2/a;-><init>(Landroid/widget/ImageView;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, v9, LD2/h;->d:LF2/b;

    .line 76
    .line 77
    invoke-virtual {v9}, LD2/h;->b()V

    .line 78
    .line 79
    .line 80
    new-instance v2, LO3/g0;

    .line 81
    .line 82
    iget-object v3, p0, LZ4/x;->t:LW0/c;

    .line 83
    .line 84
    iget-object v4, p0, LZ4/x;->u:Ljava/lang/String;

    .line 85
    .line 86
    iget-wide v5, p0, LZ4/x;->v:J

    .line 87
    .line 88
    iget-object v7, p0, LZ4/x;->w:LB5/c;

    .line 89
    .line 90
    invoke-direct/range {v2 .. v8}, LO3/g0;-><init>(LW0/c;Ljava/lang/String;JLB5/c;Landroid/widget/ImageView;)V

    .line 91
    .line 92
    .line 93
    iput-object v2, v9, LD2/h;->e:LD2/i;

    .line 94
    .line 95
    invoke-virtual {v9}, LD2/h;->a()LD2/j;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Lt2/l;->b(LD2/j;)LD2/l;

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v8}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Landroid/widget/ImageView;

    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lt2/a;->a(Landroid/content/Context;)Lt2/l;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    new-instance v3, LD2/h;

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-direct {v3, v4}, LD2/h;-><init>(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    iput-object v1, v3, LD2/h;->c:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance v1, LF2/a;

    .line 135
    .line 136
    invoke-direct {v1, v0}, LF2/a;-><init>(Landroid/widget/ImageView;)V

    .line 137
    .line 138
    .line 139
    iput-object v1, v3, LD2/h;->d:LF2/b;

    .line 140
    .line 141
    invoke-virtual {v3}, LD2/h;->b()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, LD2/h;->a()LD2/j;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v2, v0}, Lt2/l;->b(LD2/j;)LD2/l;

    .line 149
    .line 150
    .line 151
    :goto_0
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-object p1
.end method
