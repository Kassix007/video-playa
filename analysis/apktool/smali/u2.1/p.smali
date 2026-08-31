.class public final synthetic Lu2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lz0/J;


# direct methods
.method public synthetic constructor <init>(Lz0/J;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu2/p;->q:I

    iput-object p1, p0, Lu2/p;->r:Lz0/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lu2/p;->q:I

    .line 2
    .line 3
    check-cast p1, Lz0/I;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lu2/p;->r:Lz0/J;

    .line 10
    .line 11
    invoke-static {p1, v1, v0, v0}, Lz0/I;->f(Lz0/I;Lz0/J;II)V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    iget-object v1, p0, Lu2/p;->r:Lz0/J;

    .line 19
    .line 20
    invoke-static {p1, v1, v0, v0}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
