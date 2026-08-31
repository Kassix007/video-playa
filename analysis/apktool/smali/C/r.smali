.class public final LC/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP/W;

.field public final synthetic s:Ljava/util/ArrayList;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Z


# direct methods
.method public synthetic constructor <init>(LP/W;Ljava/util/ArrayList;Ljava/util/List;ZI)V
    .locals 0

    .line 1
    iput p5, p0, LC/r;->q:I

    iput-object p1, p0, LC/r;->r:LP/W;

    iput-object p2, p0, LC/r;->s:Ljava/util/ArrayList;

    iput-object p3, p0, LC/r;->t:Ljava/lang/Object;

    iput-boolean p4, p0, LC/r;->u:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LC/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lz0/I;

    .line 7
    .line 8
    new-instance v0, LC/q;

    .line 9
    .line 10
    iget-boolean v1, p0, LC/r;->u:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, p0, LC/r;->s:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v4, p0, LC/r;->t:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0, v3, v4, v1, v2}, LC/q;-><init>(Ljava/util/ArrayList;Ljava/util/List;ZI)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p1, Lz0/I;->a:Z

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LC/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p1, Lz0/I;->a:Z

    .line 28
    .line 29
    iget-object p1, p0, LC/r;->r:LP/W;

    .line 30
    .line 31
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    check-cast p1, Lz0/I;

    .line 38
    .line 39
    new-instance v0, LC/q;

    .line 40
    .line 41
    iget-boolean v1, p0, LC/r;->u:Z

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iget-object v3, p0, LC/r;->s:Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v4, p0, LC/r;->t:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v0, v3, v4, v1, v2}, LC/q;-><init>(Ljava/util/ArrayList;Ljava/util/List;ZI)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    iput-boolean v1, p1, Lz0/I;->a:Z

    .line 53
    .line 54
    invoke-virtual {v0, p1}, LC/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-boolean v0, p1, Lz0/I;->a:Z

    .line 59
    .line 60
    iget-object p1, p0, LC/r;->r:LP/W;

    .line 61
    .line 62
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 66
    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
