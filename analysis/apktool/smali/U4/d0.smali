.class public final synthetic LU4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LR4/k1;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LU4/d0;->q:I

    iput-object p1, p0, LU4/d0;->r:LR4/k1;

    iput-object p2, p0, LU4/d0;->s:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LU4/d0;->q:I

    .line 2
    .line 3
    check-cast p1, Landroid/content/res/Configuration;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LU4/d0;->r:LR4/k1;

    .line 9
    .line 10
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    iget-object v1, p0, LU4/d0;->s:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    iget-object p1, p0, LU4/d0;->r:LR4/k1;

    .line 23
    .line 24
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iget-object v1, p0, LU4/d0;->s:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v1, v1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_1
    iget-object p1, p0, LU4/d0;->r:LR4/k1;

    .line 34
    .line 35
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iget-object v1, p0, LU4/d0;->s:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/P1;->X(Ljava/lang/String;Ljava/lang/String;Lh/h;Z)V

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
