.class public final Lu/w0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# static fields
.field public static final q:Lu/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu/w0;->q:Lu/w0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La0/t;

    .line 2
    .line 3
    sget-object v1, Lu/m0;->s:Lu/m0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La0/t;-><init>(LB5/c;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La0/t;->d()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
