.class public final synthetic La5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/c;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LB5/c;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p8, p0, La5/r;->q:I

    iput-object p1, p0, La5/r;->s:Ljava/lang/Object;

    iput-object p2, p0, La5/r;->t:Ljava/lang/Object;

    iput-object p3, p0, La5/r;->u:Ljava/lang/Object;

    iput-object p4, p0, La5/r;->v:Ljava/lang/Object;

    iput-object p5, p0, La5/r;->r:LB5/c;

    iput-object p6, p0, La5/r;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, La5/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La5/r;->s:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, LR4/k1;

    .line 10
    .line 11
    iget-object v0, p0, La5/r;->u:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v0, p0, La5/r;->v:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, LR4/x;

    .line 20
    .line 21
    iget-object v0, p0, La5/r;->w:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v6, v0

    .line 24
    check-cast v6, Ljava/lang/Integer;

    .line 25
    .line 26
    move-object v7, p1

    .line 27
    check-cast v7, LP/o;

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
    move-result v8

    .line 39
    iget-object v2, p0, La5/r;->t:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v5, p0, La5/r;->r:LB5/c;

    .line 42
    .line 43
    invoke-static/range {v1 .. v8}, LE3/h;->h(LR4/k1;Ljava/util/List;Ljava/lang/Boolean;LR4/x;LB5/c;Ljava/lang/Integer;LP/o;I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    iget-object v0, p0, La5/r;->s:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v1, v0

    .line 52
    check-cast v1, La5/c;

    .line 53
    .line 54
    iget-object v0, p0, La5/r;->t:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v0, p0, La5/r;->u:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, v0

    .line 62
    check-cast v3, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v0, p0, La5/r;->v:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v4, v0

    .line 67
    check-cast v4, Lcom/web2native/MainActivity;

    .line 68
    .line 69
    iget-object v0, p0, La5/r;->w:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v6, v0

    .line 72
    check-cast v6, LB5/a;

    .line 73
    .line 74
    move-object v7, p1

    .line 75
    check-cast v7, LP/o;

    .line 76
    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    invoke-static {p1}, LP/b;->w(I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    iget-object v5, p0, La5/r;->r:LB5/c;

    .line 88
    .line 89
    invoke-static/range {v1 .. v8}, LC3/a;->d(La5/c;Ljava/lang/String;Ljava/lang/String;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/o;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
