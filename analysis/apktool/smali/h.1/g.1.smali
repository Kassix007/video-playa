.class public final Lh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/a;


# instance fields
.field public final synthetic a:Lcom/web2native/MainActivity;


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/g;->a:Lcom/web2native/MainActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lb/l;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lh/g;->a:Lcom/web2native/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lh/h;->l()Lh/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lh/l;->a()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lb/l;->t:LZ/m;

    .line 11
    .line 12
    iget-object p1, p1, LZ/m;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LZ/m;

    .line 15
    .line 16
    const-string v1, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, LZ/m;->h(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lh/l;->c()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
