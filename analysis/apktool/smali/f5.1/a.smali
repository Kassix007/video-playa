.class public final synthetic Lf5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/c;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(LB5/c;II)V
    .locals 0

    .line 1
    iput p3, p0, Lf5/a;->q:I

    iput-object p1, p0, Lf5/a;->r:LB5/c;

    iput p2, p0, Lf5/a;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lf5/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lf5/a;->s:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lf5/a;->r:LB5/c;

    .line 13
    .line 14
    invoke-interface {v1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget v0, p0, Lf5/a;->s:I

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lf5/a;->r:LB5/c;

    .line 27
    .line 28
    invoke-interface {v1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    iget v0, p0, Lf5/a;->s:I

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lf5/a;->r:LB5/c;

    .line 39
    .line 40
    invoke-interface {v1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
