.class public final synthetic La3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/x;


# instance fields
.field public final synthetic a:La3/y;

.field public final synthetic b:Lg3/e;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:LZ/m;


# direct methods
.method public synthetic constructor <init>(La3/y;Lg3/e;Ljava/lang/Object;LZ/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/r;->a:La3/y;

    iput-object p2, p0, La3/r;->b:Lg3/e;

    iput-object p3, p0, La3/r;->c:Ljava/lang/Object;

    iput-object p4, p0, La3/r;->d:LZ/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, La3/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La3/r;->d:LZ/m;

    .line 4
    .line 5
    iget-object v2, p0, La3/r;->a:La3/y;

    .line 6
    .line 7
    iget-object v3, p0, La3/r;->b:Lg3/e;

    .line 8
    .line 9
    invoke-virtual {v2, v3, v0, v1}, La3/y;->a(Lg3/e;Ljava/lang/Object;LZ/m;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
